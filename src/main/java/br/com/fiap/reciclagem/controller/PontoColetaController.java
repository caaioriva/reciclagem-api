package br.com.fiap.reciclagem.controller;

import br.com.fiap.reciclagem.dto.PontoColetaDTO;
import br.com.fiap.reciclagem.entity.PontoColeta;
import br.com.fiap.reciclagem.service.PontoColetaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Pontos de Coleta",
        description = "Endpoints para gerenciamento de pontos de coleta recicláveis"
)
@RestController
@RequestMapping("/pontos-coleta")
public class PontoColetaController {

    private final PontoColetaService service;

    public PontoColetaController(PontoColetaService service) {
        this.service = service;
    }

    @Operation(summary = "Listar todos os pontos de coleta")
    @GetMapping
    public List<PontoColeta> listarTodos() {
        return service.listarTodos();
    }

    @Operation(summary = "Buscar ponto de coleta por ID")
    @GetMapping("/{id}")
    public ResponseEntity<PontoColeta> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Cadastrar novo ponto de coleta")
    @PostMapping
    public ResponseEntity<PontoColeta> salvar(@RequestBody @Valid PontoColetaDTO dto) {
        PontoColeta pontoColeta = new PontoColeta();

        pontoColeta.setNome(dto.getNome());
        pontoColeta.setEndereco(dto.getEndereco());
        pontoColeta.setTipoResiduo(dto.getTipoResiduo());
        pontoColeta.setCapacidade(dto.getCapacidade());
        pontoColeta.setAtivo(dto.getAtivo());

        return ResponseEntity.status(201).body(service.salvar(pontoColeta));
    }

    @Operation(summary = "Atualizar ponto de coleta")
    @PutMapping("/{id}")
    public ResponseEntity<PontoColeta> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid PontoColetaDTO dto
    ) {
        PontoColeta pontoColeta = new PontoColeta();

        pontoColeta.setId(id);
        pontoColeta.setNome(dto.getNome());
        pontoColeta.setEndereco(dto.getEndereco());
        pontoColeta.setTipoResiduo(dto.getTipoResiduo());
        pontoColeta.setCapacidade(dto.getCapacidade());
        pontoColeta.setAtivo(dto.getAtivo());

        return ResponseEntity.ok(service.salvar(pontoColeta));
    }

    @Operation(summary = "Remover ponto de coleta")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}