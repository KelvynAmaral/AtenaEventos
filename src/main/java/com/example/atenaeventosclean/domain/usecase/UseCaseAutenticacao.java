package com.example.atenaeventosclean.domain.usecase;


import com.example.atenaeventosclean.domain.entity.usuario.Usuario;

public interface UseCaseAutenticacao {

    Usuario registrarUsuario(Usuario usuario);
    Usuario autenticarUsuario(String email, String senha);
    boolean autorizarUsuario(Long usuarioId, String papel);
}
