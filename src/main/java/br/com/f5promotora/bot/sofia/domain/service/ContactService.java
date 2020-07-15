package br.com.f5promotora.bot.sofia.domain.service;

import br.com.f5promotora.bot.sofia.data.v1.dto.ContactDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ContactForm;

public interface ContactService extends Service<ContactDTO, ContactForm, ContactFilter> {
}
