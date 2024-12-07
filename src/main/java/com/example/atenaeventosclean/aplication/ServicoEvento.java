package com.example.atenaeventosclean.aplication;

import com.example.atenaeventosclean.domain.entity.evento.Evento;
import com.example.atenaeventosclean.domain.repository.RepositorioEvento;
import com.example.atenaeventosclean.domain.usecase.UseCaseEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoEvento implements UseCaseEvento {


    private RepositorioEvento repositorioEvento;

    @Autowired
    public ServicoEvento(RepositorioEvento repositorioEvento) {
        this.repositorioEvento = repositorioEvento;
    }


    @Override
    public List<Evento> listarTodosEventos() {
        return List.of();
    }

    @Override
    public Optional<Evento> buscarEventoPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Evento criarEvento(Evento evento) {
        return null;
    }

    @Override
    public Evento atualizarEvento(Long id, Evento evento) {
        return null;
    }

    @Override
    public void excluirEvento(Long id) {

    }
}
