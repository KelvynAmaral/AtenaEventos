package com.example.atenaeventosclean.domain.entity.avaliacao;

import com.example.atenaeventosclean.domain.entity.evento.Evento;
import com.example.atenaeventosclean.domain.entity.usuario.Usuario;

import java.time.LocalDateTime;

public class Avaliacao {

    private Long id;
    private Evento evento;
    private Usuario participante;
    private int nota;
    private String comentario;
    private LocalDateTime dataAvaliacao;

    public Avaliacao(Long id, Evento evento, Usuario participante, int nota, String comentario, LocalDateTime dataAvaliacao) {
        this.id = id;
        this.evento = evento;
        this.participante = participante;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
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

    public Usuario getParticipante() {
        return participante;
    }

    public void setParticipante(Usuario participante) {
        this.participante = participante;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDateTime dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
