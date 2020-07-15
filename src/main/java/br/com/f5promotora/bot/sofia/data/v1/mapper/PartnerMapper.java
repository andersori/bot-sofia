package br.com.f5promotora.bot.sofia.data.v1.mapper;

import org.mapstruct.Mapper;
import br.com.f5promotora.bot.sofia.data.DTOMapper;
import br.com.f5promotora.bot.sofia.data.FormMapper;
import br.com.f5promotora.bot.sofia.data.document.Partner;
import br.com.f5promotora.bot.sofia.data.v1.dto.PartnerDTO;
import br.com.f5promotora.bot.sofia.data.v1.form.PartnerForm;

@Mapper(componentModel = "spring")
public interface PartnerMapper
    extends DTOMapper<Partner, PartnerDTO>, FormMapper<Partner, PartnerForm> {
}
