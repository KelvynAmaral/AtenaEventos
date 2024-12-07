package com.example.atenaeventosclean.infrastructure;

import com.example.atenaeventosclean.domain.entity.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEventoJpa extends JpaRepository<Evento, Long> {
}
