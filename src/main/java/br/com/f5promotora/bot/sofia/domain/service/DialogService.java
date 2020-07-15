package br.com.f5promotora.bot.sofia.domain.service;

import br.com.f5promotora.bot.sofia.data.v1.dto.DialogDTO;
import br.com.f5promotora.bot.sofia.data.v1.filter.DialogFilter;
import br.com.f5promotora.bot.sofia.data.v1.form.DialogForm;

public interface DialogService extends Service<DialogDTO, DialogForm, DialogFilter> {
}
