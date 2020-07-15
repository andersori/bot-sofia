package br.com.f5promotora.bot.sofia.domain.service.v1;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import br.com.f5promotora.bot.sofia.data.v1.dto.PartnerDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import br.com.f5promotora.bot.sofia.data.v1.filter.PartnerFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.PartnerForm;
import br.com.f5promotora.bot.sofia.data.v1.mapper.PartnerMapper;
import br.com.f5promotora.bot.sofia.domain.service.ContactService;
import br.com.f5promotora.bot.sofia.domain.service.PartnerService;
import br.com.f5promotora.bot.sofia.repository.PartnerRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("partnerServiceV1")
public class PartnerServiceImpl implements PartnerService {

  private final PartnerRepo repo;
  private final PartnerMapper mapper;
  private final ContactService contactService;

  public PartnerServiceImpl(PartnerRepo repo, PartnerMapper mapper,
      @Qualifier("contactServiceV1") ContactService contactService) {
    this.repo = repo;
    this.mapper = mapper;
    this.contactService = contactService;
  }

  @Override
  public Flux<PartnerDTO> filter(PartnerFilter filter) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<PartnerDTO> save(PartnerForm form) {
    return repo.save(mapper.formToEntity(form)).map(mapper::entitytoDto).flatMap(partner -> {
      return Flux.fromIterable(form.getContacts()).doOnNext(con -> con.setPartnerId(partner.getId())).flatMap(contactService::save)
          .collect(Collectors.toSet()).doOnNext(contacts -> {
            partner.setContacts(contacts);
          }).thenReturn(partner);
    });
  }

  @Override
  public Mono<PartnerDTO> get(String id) {
    return Mono.defer(() -> repo.findById(id).map(mapper::entitytoDto).flatMap(partner -> {
      return contactService.filter(ContactFilter.builder().setPartnerId(partner.getId()).build())
          .collect(Collectors.toSet()).doOnNext(contacts -> {
            partner.setContacts(contacts);
          }).thenReturn(partner);
    })).switchIfEmpty(Mono.defer(() -> {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não existe parceiro com esse id");
    }));
  }

}
