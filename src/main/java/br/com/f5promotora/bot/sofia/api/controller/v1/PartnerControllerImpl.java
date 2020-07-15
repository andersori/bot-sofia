package br.com.f5promotora.bot.sofia.api.controller.v1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.f5promotora.bot.sofia.api.controller.PartnerController;
import br.com.f5promotora.bot.sofia.data.v1.dto.PartnerDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.PartnerFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.PartnerForm;
import br.com.f5promotora.bot.sofia.domain.service.PartnerService;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/partner")
@RestController("partnerControllerV1")
public class PartnerControllerImpl
    implements PartnerController<PartnerDTO, PartnerForm, PartnerFilter> {

  private final PartnerService service;

  public PartnerControllerImpl(@Qualifier("partnerServiceV1") PartnerService service) {
    this.service = service;
  }

  @Override
  public Flux<PartnerDTO> filter(PartnerFilter filter) {
    return null;
  }

  @Override
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  @ApiOperation(httpMethod = "POST", value = "Cadastrar parceiro", response = PartnerDTO.class)
  public Mono<PartnerDTO> save(@RequestBody PartnerForm form) {
    return service.save(form);
  }

  @Override
  @GetMapping("/{id}")
  @ApiOperation(httpMethod = "GET", value = "Obter", response = PartnerDTO.class)
  public Mono<PartnerDTO> get(@PathVariable String id) {
    return service.get(id);
  }

}
