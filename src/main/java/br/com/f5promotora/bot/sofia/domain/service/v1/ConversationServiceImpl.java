package br.com.f5promotora.bot.sofia.domain.service.v1;

import org.springframework.stereotype.Service;
import br.com.f5promotora.bot.sofia.data.v1.dto.ConversationDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ConversationFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ConversationForm;
import br.com.f5promotora.bot.sofia.domain.service.ConversationService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConversationServiceImpl implements ConversationService {

  @Override
  public Flux<ConversationDTO> filter(ConversationFilter filter) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<ConversationDTO> save(ConversationForm form) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Mono<ConversationDTO> get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

}
