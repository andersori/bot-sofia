package br.com.f5promotora.bot.sofia.data.v1.mapper;

import org.mapstruct.Mapper;
import br.com.f5promotora.bot.sofia.data.DTOMapper;
import br.com.f5promotora.bot.sofia.data.FormMapper;
import br.com.f5promotora.bot.sofia.data.document.Conversation;
import br.com.f5promotora.bot.sofia.data.v1.dto.ConversationDTO;
import br.com.f5promotora.bot.sofia.data.v1.form.ConversationForm;


@Mapper(componentModel = "spring")
public interface ConversationMapper
    extends DTOMapper<Conversation, ConversationDTO>, FormMapper<Conversation, ConversationForm> {
}
