package br.com.fiap.reciclagem.service;

import br.com.fiap.reciclagem.entity.PontoColeta;
import br.com.fiap.reciclagem.repository.PontoColetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PontoColetaService {

    private final PontoColetaRepository repository;

    public PontoColetaService(
            PontoColetaRepository repository
    ) {
        this.repository = repository;
    }

    public List<PontoColeta> listarTodos() {

        return repository.findAll();
    }

    public Optional<PontoColeta> buscarPorId(Long id) {

        return repository.findById(id);
    }

    public PontoColeta salvar(
            PontoColeta pontoColeta
    ) {

        return repository.save(pontoColeta);
    }

    public void deletar(Long id) {

        repository.deleteById(id);
    }
}