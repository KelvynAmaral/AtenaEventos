package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.inscricao.Inscricao;

import java.util.List;

public interface UseCaseInscricao {

    Inscricao inscreverParticipante(Long eventoId, String nomeParticipante, String emailParticipante);
    List<Inscricao> listarInscricoesPorEvento(Long eventoId);
    List<Inscricao> listarInscricoesConfirmadas(Long eventoId);
    List<Inscricao> listarInscricoesEmEspera(Long eventoId);
    void cancelarInscricao(Long inscricaoId);
}
