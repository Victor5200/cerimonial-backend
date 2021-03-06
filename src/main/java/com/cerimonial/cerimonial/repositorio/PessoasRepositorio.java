package com.cerimonial.cerimonial.repositorio;

import com.cerimonial.cerimonial.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepositorio extends JpaRepository <PessoaModel, Long>{

};
