package com.example.atenaeventosclean.domain.entity.notificacao;

import com.example.atenaeventosclean.domain.entity.usuario.Usuario;

import java.time.LocalDateTime;

public class Notificacao {
    private Long id;
    private Usuario destinatario;
    private String conteudo;
    private LocalDateTime dataEnvio;
    private boolean lida;

    public Notificacao(Long id, Usuario destinatario, String conteudo, LocalDateTime dataEnvio, boolean lida) {
        this.id = id;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.lida = lida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }
}
