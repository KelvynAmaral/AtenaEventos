package com.example.atenaeventosclean.domain.usecase;

import com.example.atenaeventosclean.domain.entity.notificacao.Notificacao;

import java.util.List;

public interface UseCaseComunicacao {

    void enviarNotificacao(Long usuarioId, String conteudo);
    List<Notificacao> listarNotificacoesPorUsuario(Long usuarioId);
    void marcarNotificacaoComoLida(Long notificacaoId);
}

