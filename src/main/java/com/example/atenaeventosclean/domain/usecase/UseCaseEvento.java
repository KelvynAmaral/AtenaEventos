package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.evento.Evento;

import java.util.List;

public interface UseCaseEvento {

    Evento criarEvento(Long eventoId, Evento evento);
    List<Evento> listarAtividadesPorEvento(Long eventoId);
    Evento atualizarEvento(Long atividadeId, Evento evento);
    void excluirEvento(Long eventoId);
}

