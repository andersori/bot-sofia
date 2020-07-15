package br.com.f5promotora.bot.sofia.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import br.com.f5promotora.bot.sofia.data.document.Conversation;

public interface ConversationRepo extends ReactiveMongoRepository<Conversation, String> {
}
