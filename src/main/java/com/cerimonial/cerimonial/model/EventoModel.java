package com.cerimonial.cerimonial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeDoEvento;
    private String descricao;
    private String motivo;
    private String local;
    private String traje;
    private String emailDoEvento;
    private String observacao;

    @ManyToMany()
    @JoinTable( name = "Convidado_Evento",
            joinColumns ={@JoinColumn(name = "id_evento")},
            inverseJoinColumns = {@JoinColumn(name = "id_pessoa")}
    )
    private List<PessoaModel> listaConvidado;


}
