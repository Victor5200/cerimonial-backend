package com.cerimonial.cerimonial.Service;

import com.cerimonial.cerimonial.DTO.PessoaDTO;
import com.cerimonial.cerimonial.model.PessoaModel;
import com.cerimonial.cerimonial.repositorio.PessoasRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public PessoaDTO saveById(PessoaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        PessoaModel model = mapper.map(dto, PessoaModel.class);
        return mapper.map(pessoasRepositorio.save(model), PessoaDTO.class);
    }

    public void delete(long id ) {
         pessoasRepositorio.deleteById(id);
    }

    public PessoaModel save(PessoaModel model) {
        return pessoasRepositorio.save(model);
    }
}

