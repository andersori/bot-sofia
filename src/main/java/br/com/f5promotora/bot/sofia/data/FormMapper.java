package br.com.f5promotora.bot.sofia.data;

import java.util.Set;

public interface FormMapper<E, F> {

  E formToEntity(F form);

  Set<E> formToEntity(Set<F> form);
}
