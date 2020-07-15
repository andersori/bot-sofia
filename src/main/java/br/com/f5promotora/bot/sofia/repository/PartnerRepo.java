package br.com.f5promotora.bot.sofia.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import br.com.f5promotora.bot.sofia.data.document.Partner;

public interface PartnerRepo extends ReactiveMongoRepository<Partner, String> {
}
