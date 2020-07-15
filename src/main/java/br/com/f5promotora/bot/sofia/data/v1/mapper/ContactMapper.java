package br.com.f5promotora.bot.sofia.data.v1.mapper;

import org.mapstruct.Mapper;
import br.com.f5promotora.bot.sofia.data.DTOMapper;
import br.com.f5promotora.bot.sofia.data.FilterMapper;
import br.com.f5promotora.bot.sofia.data.FormMapper;
import br.com.f5promotora.bot.sofia.data.document.Contact;
import br.com.f5promotora.bot.sofia.data.v1.dto.ContactDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ContactFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ContactForm;

@Mapper(componentModel = "spring")
public interface ContactMapper extends DTOMapper<Contact, ContactDTO>,
    FormMapper<Contact, ContactForm>, FilterMapper<Contact, ContactFilter> {
}
