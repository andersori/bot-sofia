package br.com.f5promotora.bot.sofia.domain.service;

import br.com.f5promotora.bot.sofia.data.v1.dto.MessageDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.MessageFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.MessageForm;

public interface MessageService extends Service<MessageDTO, MessageForm, MessageFilter> {
}
