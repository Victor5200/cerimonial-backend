package com.cerimonial.cerimonial.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String dataNascimento;
    private String genero;
    private String email;
    private String telefone;
    private String observacao;
}


