package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.avaliacao.Avaliacao;

import java.util.List;

public interface UseCaseAvaliacao {

    Avaliacao criarAvaliacao(Long eventoId, Long participanteId, Avaliacao avaliacao);
    List<Avaliacao> listarAvaliacoesPorEvento(Long eventoId);
    double calcularMediaAvaliacoesPorEvento(Long eventoId);

}
