package br.com.f5promotora.bot.sofia.domain.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Service<DTO, Form, Filter> {

  Flux<DTO> filter(Filter filter);
  
  Mono<DTO> save(Form form);

  Mono<DTO> get(String id);
}
