package com.cerimonial.cerimonial.Service;

import com.cerimonial.cerimonial.model.PessoaModel;
import com.cerimonial.cerimonial.repositorio.PessoasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoasService {

    @Autowired
    PessoasRepositorio pessoasRepositorio;

    public List<PessoaModel> listPessoa() {
        return pessoasRepositorio.findAll();
    }

    public PessoaModel pessoaById(long id) {
        return pessoasRepositorio.getById(id);
    }

    public PessoaModel saveById(PessoaModel pessoaModel) {
        return pessoasRepositorio.save(pessoaModel);
    }

    public void delete(long id ) {
         pessoasRepositorio.deleteById(id);
    }
}

