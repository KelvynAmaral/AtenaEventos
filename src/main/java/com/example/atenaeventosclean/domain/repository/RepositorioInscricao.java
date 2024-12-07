package com.example.atenaeventosclean.domain.repository;

import com.example.atenaeventosclean.domain.entity.inscricao.Inscricao;
import com.example.atenaeventosclean.domain.entity.inscricao.StatusInscricao;

import java.util.List;
import java.util.Optional;

public interface RepositorioInscricao {

    Inscricao salvar(Inscricao inscricao);
    Optional<Inscricao> buscarPorId(Long id);
    List<Inscricao> buscarPorEventoId(Long eventoId);
    List<Inscricao> buscarPorUsuarioId(Long usuarioId);
    List<Inscricao> buscarPorEventoIdEStatus(Long eventoId, StatusInscricao status);
    long contarPorEventoIdEStatus(Long eventoId, StatusInscricao status);
    void excluir(Long id);
}
