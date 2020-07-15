package br.com.f5promotora.bot.sofia.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import br.com.f5promotora.bot.sofia.data.document.Message;

public interface MessageRepo extends ReactiveMongoRepository<Message, String> {
}