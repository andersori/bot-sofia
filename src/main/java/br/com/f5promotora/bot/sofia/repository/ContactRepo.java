package br.com.f5promotora.bot.sofia.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.querydsl.ReactiveQuerydslPredicateExecutor;
import br.com.f5promotora.bot.sofia.data.document.Contact;

public interface ContactRepo extends ReactiveMongoRepository<Contact, String>,
    ReactiveQuerydslPredicateExecutor<Contact> {
}
