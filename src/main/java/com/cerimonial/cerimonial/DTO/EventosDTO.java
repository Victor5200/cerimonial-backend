package com.cerimonial.cerimonial.DTO;

import com.cerimonial.cerimonial.model.PessoaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;


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

    private List<PessoaDTO> listaConvidado;
}

