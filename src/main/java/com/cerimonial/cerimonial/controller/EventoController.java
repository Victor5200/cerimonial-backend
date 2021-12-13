package com.cerimonial.cerimonial.controller;


import com.cerimonial.cerimonial.DTO.EventosDTO;
import com.cerimonial.cerimonial.Service.EventosService;
import com.cerimonial.cerimonial.model.EventoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/eventos")
public class EventoController {

    @Autowired
    EventosService eventosService;

    @GetMapping(path = "/{id}")
        public ResponseEntity <EventoModel> buscarPorId (@PathVariable long id){
            return ResponseEntity.ok (eventosService.buscarPorId(id));
    }
    @GetMapping()
    public ResponseEntity<List<EventoModel>> find(){
        return ResponseEntity.ok(eventosService.listEventos());
    }

    @PostMapping
    public ResponseEntity <EventosDTO> save(@RequestBody EventosDTO dto){
        return ResponseEntity.ok(eventosService.saveById(dto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id ){
        eventosService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
