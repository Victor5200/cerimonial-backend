package com.cerimonial.cerimonial.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventosDTO {

    private long id;
    private String nomeDoEvento;
    private String descricao;
    private String motivo;
    private String local;
    private String traje;
    private String emailDoEvento;
    private String observacao;
}

