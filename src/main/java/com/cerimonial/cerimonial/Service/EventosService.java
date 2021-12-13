package com.cerimonial.cerimonial.Service;

import com.cerimonial.cerimonial.DTO.EventosDTO;
import com.cerimonial.cerimonial.model.EventoModel;
import com.cerimonial.cerimonial.repositorio.EventosRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EventosService {

    @Autowired
    EventosRepositorio eventosRepositorio;

    public List<EventoModel> listEventos() {
        return eventosRepositorio.findAll();
    }

    public EventoModel buscarPorId(long id) {
        return eventosRepositorio.findById(id).get();
    }

    public EventosDTO saveById (EventosDTO dto){
        ModelMapper mapper = new ModelMapper();
        EventoModel model = mapper.map(dto, EventoModel.class);
        return mapper.map (eventosRepositorio.save (model), EventosDTO.class);


    }

    @Transactional
    public void delete(long id) {
        eventosRepositorio.deleteById(id);
    }
}
