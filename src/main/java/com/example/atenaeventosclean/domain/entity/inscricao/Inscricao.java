package com.example.atenaeventosclean.domain.entity.inscricao;

import com.example.atenaeventosclean.domain.entity.evento.Evento;

import java.time.LocalDateTime;

public class Inscricao {

    private Long id;
    private Evento evento;
    private String nomeParticipante;
    private String emailParticipante;
    private LocalDateTime dataInscricao;
    private StatusInscricao status;

    public Inscricao(Long id, Evento evento, String nomeParticipante, String emailParticipante, LocalDateTime dataInscricao, StatusInscricao status) {
        this.id = id;
        this.evento = evento;
        this.nomeParticipante = nomeParticipante;
        this.emailParticipante = emailParticipante;
        this.dataInscricao = dataInscricao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public String getEmailParticipante() {
        return emailParticipante;
    }

    public void setEmailParticipante(String emailParticipante) {
        this.emailParticipante = emailParticipante;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public StatusInscricao getStatus() {
        return status;
    }

    public void setStatus(StatusInscricao status) {
        this.status = status;
    }
}
