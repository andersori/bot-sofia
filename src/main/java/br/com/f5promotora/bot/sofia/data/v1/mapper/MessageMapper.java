package br.com.f5promotora.bot.sofia.data.v1.mapper;

import org.mapstruct.Mapper;
import br.com.f5promotora.bot.sofia.data.DTOMapper;
import br.com.f5promotora.bot.sofia.data.FormMapper;
import br.com.f5promotora.bot.sofia.data.document.Message;
import br.com.f5promotora.bot.sofia.data.v1.dto.MessageDTO;
import br.com.f5promotora.bot.sofia.data.v1.form.MessageForm;

@Mapper(componentModel = "spring")
public interface MessageMapper
    extends DTOMapper<Message, MessageDTO>, FormMapper<Message, MessageForm> {
}
