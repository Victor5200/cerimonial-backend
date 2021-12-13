package com.cerimonial.cerimonial.controller;

import com.cerimonial.cerimonial.DTO.EventosDTO;
import com.cerimonial.cerimonial.DTO.PessoaDTO;
import com.cerimonial.cerimonial.Service.PessoasService;
import com.cerimonial.cerimonial.model.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/pessoa")
public class PessoaController {

    @Autowired
    PessoasService pessoasService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<PessoaModel> findById(@PathVariable long id){
        return ResponseEntity.ok(pessoasService.pessoaById(id));
    }

    @GetMapping()
    public ResponseEntity<List<PessoaModel>> find(){

        return ResponseEntity.ok(pessoasService.listPessoa());
    }

    @PostMapping
    public ResponseEntity <PessoaDTO> save(@RequestBody PessoaDTO dto){
        return ResponseEntity.ok(pessoasService.saveById(dto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id ){
        pessoasService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
