package br.com.f5promotora.bot.sofia.domain.service.v1;

import org.springframework.stereotype.Service;
import br.com.f5promotora.bot.sofia.data.v1.dto.DialogDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.DialogFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.DialogForm;
import br.com.f5promotora.bot.sofia.domain.service.DialogService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DialogServiceImpl implements DialogService {

  @Override
  public Flux<DialogDTO> filter(DialogFilter filter) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<DialogDTO> save(DialogForm form) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<DialogDTO> get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

}
