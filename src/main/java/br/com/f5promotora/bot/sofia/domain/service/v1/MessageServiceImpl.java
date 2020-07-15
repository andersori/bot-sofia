package br.com.f5promotora.bot.sofia.domain.service.v1;

import org.springframework.stereotype.Service;
import br.com.f5promotora.bot.sofia.data.v1.dto.MessageDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.MessageFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.MessageForm;
import br.com.f5promotora.bot.sofia.domain.service.MessageService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageServiceImpl implements MessageService {

  @Override
  public Flux<MessageDTO> filter(MessageFilter filter) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<MessageDTO> save(MessageForm form) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<MessageDTO> get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

}
