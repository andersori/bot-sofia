package br.com.f5promotora.bot.sofia.repository.filter.v1;

import java.util.Objects;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import reactor.core.publisher.Mono;

public class ContactExample {
  public static Mono<ExampleMatcher> getMatcher(ContactFilter filter) {
    return Mono.defer(() -> {
      ExampleMatcher matcher = ExampleMatcher.matchingAny().withIgnoreNullValues();
      if (Objects.nonNull(filter.getPartnerId())) {
        matcher.withMatcher("partnerId", GenericPropertyMatchers.exact());
      }
      if (Objects.nonNull(filter.getPhone())) {
        matcher.withMatcher("phone", GenericPropertyMatchers.startsWith());
      }
      if (Objects.nonNull(filter.getCreatedAt())) {
        matcher.withMatcher("createdAt", GenericPropertyMatchers.exact());
      }

      return Mono.just(matcher);
    });
  }
}

