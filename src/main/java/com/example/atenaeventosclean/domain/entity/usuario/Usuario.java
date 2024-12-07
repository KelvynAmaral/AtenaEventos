package com.example.atenaeventosclean.domain.entity.usuario;

import java.util.Set;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Set<String> papeis;

    public Usuario(Long id, String nome, String email, String senha, Set<String> papeis) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.papeis = papeis;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<String> getPapeis() {
        return papeis;
    }

    public void setPapeis(Set<String> papeis) {
        this.papeis = papeis;
    }
}
