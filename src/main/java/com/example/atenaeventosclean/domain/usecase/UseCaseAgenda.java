package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.atividade.Atividade;

import java.util.List;

public interface UseCaseAgenda {

    Atividade criarAtividade(Long eventoId, Atividade atividade);
    List<Atividade> listarAtividadesPorEvento(Long eventoId);
    Atividade atualizarAtividade(Long atividadeId, Atividade atividade);
    void excluirAtividade(Long atividadeId);
}
