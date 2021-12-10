package com.cerimonial.cerimonial.Mappers;

import com.cerimonial.cerimonial.DTO.PessoaDTO;
import com.cerimonial.cerimonial.model.PessoaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PessoaMapper {

    PessoaModel toModel(PessoaDTO dto);

    PessoaDTO toDto(PessoaModel model);

}
