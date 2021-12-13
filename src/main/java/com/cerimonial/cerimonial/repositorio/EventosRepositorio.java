package com.cerimonial.cerimonial.repositorio;

import com.cerimonial.cerimonial.model.EventoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventosRepositorio extends JpaRepository<EventoModel, Long> {
}
