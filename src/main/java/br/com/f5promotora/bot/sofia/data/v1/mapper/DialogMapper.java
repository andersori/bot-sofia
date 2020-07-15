package br.com.f5promotora.bot.sofia.data.v1.mapper;

import org.mapstruct.Mapper;
import br.com.f5promotora.bot.sofia.data.DTOMapper;
import br.com.f5promotora.bot.sofia.data.FormMapper;
import br.com.f5promotora.bot.sofia.data.document.Dialog;
import br.com.f5promotora.bot.sofia.data.v1.dto.DialogDTO;
import br.com.f5promotora.bot.sofia.data.v1.form.DialogForm;

@Mapper(componentModel = "spring")
public interface DialogMapper extends DTOMapper<Dialog, DialogDTO>, FormMapper<Dialog, DialogForm> {
}
