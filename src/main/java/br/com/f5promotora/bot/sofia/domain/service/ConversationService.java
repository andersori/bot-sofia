package br.com.f5promotora.bot.sofia.domain.service;

import br.com.f5promotora.bot.sofia.data.v1.dto.ConversationDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.ConversationFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.ConversationForm;

public interface ConversationService
    extends Service<ConversationDTO, ConversationForm, ConversationFilter> {
}
