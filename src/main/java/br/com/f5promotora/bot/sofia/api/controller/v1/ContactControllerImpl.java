package br.com.f5promotora.bot.sofia.api.controller.v1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.f5promotora.bot.sofia.api.controller.ContactController;
import br.com.f5promotora.bot.sofia.data.v1.dto.ContactDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ContactForm;
import br.com.f5promotora.bot.sofia.domain.service.ContactService;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/contact")
@RestController("contactControllerV1")
public class ContactControllerImpl
    implements ContactController<ContactDTO, ContactForm, ContactFilter> {

  private final ContactService service;

  public ContactControllerImpl(@Qualifier("contactServiceV1") ContactService service) {
    this.service = service;
  }

  @Override
  @GetMapping
  @ApiOperation(httpMethod = "GET", value = "Filtro Contato", response = ContactDTO.class, responseContainer = "List")
  public Flux<ContactDTO> filter(ContactFilter filter) {
    return service.filter(filter);
  }

  @Override
  public Mono<ContactDTO> save(@RequestBody ContactForm form) {
    return null;
  }

  @Override
  public Mono<ContactDTO> get(@PathVariable String id) {
    return null;
  }

}
