package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.evento.Evento;

import java.util.List;
import java.util.Optional;

public interface UseCaseEvento {

    List<Evento> listarTodosEventos();
    Optional<Evento> buscarEventoPorId(Long id);
    Evento criarEvento(Evento evento);
    Evento atualizarEvento(Long id, Evento evento);
    void excluirEvento(Long id);
}


