package com.example.atenaeventosclean.aplication;

import com.example.atenaeventosclean.domain.entity.evento.Evento;
import com.example.atenaeventosclean.domain.usecase.UseCaseEvento;

import java.util.List;

public class ServicoEvento implements UseCaseEvento {

    @Override
    public Evento criarEvento(Long eventoId, Evento evento) {
        return null;
    }

    @Override
    public List<Evento> listarAtividadesPorEvento(Long eventoId) {
        return null;
    }

    @Override
    public Evento atualizarEvento(Long atividadeId, Evento evento) {
        return null;
    }

    @Override
    public void excluirEvento(Long eventoId) {

    }
}
