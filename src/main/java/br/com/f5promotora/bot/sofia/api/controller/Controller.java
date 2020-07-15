package br.com.f5promotora.bot.sofia.api.controller;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Controller<DTO, Form, Filter> {

  Flux<DTO> filter(Filter filter);

  Mono<DTO> save(Form form);

  Mono<DTO> get(String id);
}
