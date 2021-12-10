package com.cerimonial.cerimonial.Service;

import com.cerimonial.cerimonial.DTO.PessoaDTO;
import com.cerimonial.cerimonial.Mappers.PessoaMapper;
import com.cerimonial.cerimonial.model.PessoaModel;
import com.cerimonial.cerimonial.repositorio.PessoasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoasService {

    @Autowired
    PessoasRepositorio pessoasRepositorio;

    //@Autowired
    //PessoaMapper pessoaMapper;

    public List<PessoaModel> listPessoa() {
        return pessoasRepositorio.findAll();
    }

    public PessoaModel pessoaById(long id) {
        return pessoasRepositorio.getById(id);
    }

    public PessoaDTO saveById(PessoaDTO dto) {
        //PessoaModel pessoaModel = pessoaMapper.toModel(dto);
        //return pessoaMapper.toDto(pessoasRepositorio.save(pessoaModel));
        return null;
    }

    public void delete(long id ) {
         pessoasRepositorio.deleteById(id);
    }
}

