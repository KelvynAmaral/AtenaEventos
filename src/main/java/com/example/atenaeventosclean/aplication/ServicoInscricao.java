package com.example.atenaeventosclean.aplication;

import com.example.atenaeventosclean.domain.entity.inscricao.Inscricao;
import com.example.atenaeventosclean.domain.repository.RepositorioEvento;
import com.example.atenaeventosclean.domain.repository.RepositorioInscricao;
import com.example.atenaeventosclean.domain.usecase.UseCaseInscricao;

import java.util.List;

public class ServicoInscricao implements UseCaseInscricao {

    private final RepositorioEvento repositorioEvento;
    private final RepositorioInscricao repositorioInscricao;

    public ServicoInscricao(RepositorioEvento repositorioEvento, RepositorioInscricao repositorioInscricao) {
        this.repositorioEvento = repositorioEvento;
        this.repositorioInscricao = repositorioInscricao;
    }

    @Override
    public Inscricao inscreverParticipante(Long eventoId, String nomeParticipante, String emailParticipante) {
        return null;
    }

    @Override
    public List<Inscricao> listarInscricoesPorEvento(Long eventoId) {
        return List.of();
    }

    @Override
    public List<Inscricao> listarInscricoesConfirmadas(Long eventoId) {
        return List.of();
    }

    @Override
    public List<Inscricao> listarInscricoesEmEspera(Long eventoId) {
        return List.of();
    }

    @Override
    public void cancelarInscricao(Long inscricaoId) {

    }
}
