package br.com.f5promotora.bot.sofia.repository.filter.v1;

import java.util.ArrayList;
import java.util.List;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import br.com.f5promotora.bot.sofia.data.document.QContact;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ContactDsl {

  public static Mono<Predicate> execute(ContactFilter filter) {
    return Mono.defer(() -> {
      List<BooleanExpression> boo = new ArrayList<BooleanExpression>();

      if (filter.getPhone() != null) {
        boo.add(QContact.contact.phone.startsWith(filter.getPhone()));
      }

      if (filter.getCreatedAt() != null) {
        boo.add(QContact.contact.createdAt.eq(filter.getCreatedAt()));
      }

      if (filter.getPartnerId() != null) {
        boo.add(QContact.contact.partnerId.eq(filter.getPartnerId()));
      }

      return Flux.fromIterable(boo).reduce((a, b) -> a.and(b));
    });
  }

}

