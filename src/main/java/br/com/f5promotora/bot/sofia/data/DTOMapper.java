package br.com.f5promotora.bot.sofia.data;

import java.util.Set;
import org.mapstruct.Mapping;

public interface DTOMapper<E, D> {

  @Mapping(target = "id", source = "entity._id")
  D entitytoDto(E entity);

  Set<D> entitytoDto(Set<E> entitySet);
}
