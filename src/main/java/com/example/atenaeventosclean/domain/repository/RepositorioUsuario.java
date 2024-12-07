package com.example.atenaeventosclean.domain.repository;

import com.example.atenaeventosclean.domain.entity.usuario.Usuario;

import java.util.List;
import java.util.Optional;

public interface RepositorioUsuario {

    Usuario salvar(Usuario usuario);
    Optional<Usuario> buscarPorId(Long id);
    Optional<Usuario> buscarPorEmail(String email);
    List<Usuario> buscarTodos();
    void excluir(Long id);
    boolean existePorEmail(String email);
}
