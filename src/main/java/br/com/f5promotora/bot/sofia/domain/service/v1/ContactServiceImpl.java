package br.com.f5promotora.bot.sofia.domain.service.v1;

import java.util.Optional;
import org.springframework.stereotype.Service;
import br.com.f5promotora.bot.sofia.data.v1.dto.ContactDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ContactForm;
import br.com.f5promotora.bot.sofia.data.v1.mapper.ContactMapper;
import br.com.f5promotora.bot.sofia.domain.service.ContactService;
import br.com.f5promotora.bot.sofia.repository.ContactRepo;
import br.com.f5promotora.bot.sofia.repository.filter.v1.ContactDsl;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service("contactServiceV1")
public class ContactServiceImpl implements ContactService {

  private final ContactRepo repo;
  private final ContactMapper mapper;

  @Override
  public Flux<ContactDTO> filter(ContactFilter filter) {

    return ContactDsl.execute(filter).map(Optional::of).defaultIfEmpty(Optional.empty())
        .flatMapMany(op -> {
          if (op.isPresent()) {
            return repo.findAll(op.get());
          } else {
            return repo.findAll();
          }
        }).map(mapper::entitytoDto);
  }

  @Override
  public Mono<ContactDTO> save(ContactForm form) {
    return repo.save(mapper.formToEntity(form)).map(mapper::entitytoDto);
  }

  @Override
  public Mono<ContactDTO> get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

}
