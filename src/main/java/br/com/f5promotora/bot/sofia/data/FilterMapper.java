package br.com.f5promotora.bot.sofia.data;

public interface FilterMapper<E, F> {
  E filterToEntity(F filter);
}
