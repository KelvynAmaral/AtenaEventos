package com.example.atenaeventosclean.domain.entity.evento;

import java.time.LocalDateTime;

public class Evento {

    private Long id;
    private String nome;
    private String descricao;
    private CategoriaEvento categoria;
    private LocalDateTime dataHora;
    private String local;
    private int maximoParticipantes;

    public Evento(Long id, String nome, String descricao, CategoriaEvento categoria, LocalDateTime dataHora, String local, int maximoParticipantes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.dataHora = dataHora;
        this.local = local;
        this.maximoParticipantes = maximoParticipantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaEvento getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEvento categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getMaximoParticipantes() {
        return maximoParticipantes;
    }

    public void setMaximoParticipantes(int maximoParticipantes) {
        this.maximoParticipantes = maximoParticipantes;
    }
}
