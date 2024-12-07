package com.example.atenaeventosclean.domain.repository;

import com.example.atenaeventosclean.domain.entity.atividade.Atividade;
import com.example.atenaeventosclean.domain.entity.avaliacao.Avaliacao;
import com.example.atenaeventosclean.domain.entity.evento.Evento;

import java.util.List;
import java.util.Optional;

public interface RepositorioEvento {

    Evento salvar(Evento evento);
    Optional<Evento> buscarPorId(Long id);
    List<Evento> buscarTodos();
    List<Evento> buscarPorCategoria(String categoria);
    void excluir(Long id);

    // Métodos adicionais para Atividades
    void adicionarAtividade(Long eventoId, Atividade atividade);
    void removerAtividade(Long eventoId, Long atividadeId);
    List<Atividade> buscarAtividadesPorEvento(Long eventoId);

    // Métodos adicionais para Avaliações
    void adicionarAvaliacao(Long eventoId, Avaliacao avaliacao);
    List<Avaliacao> buscarAvaliacoesPorEvento(Long eventoId);
    double calcularMediaAvaliacoes(Long eventoId);
}
