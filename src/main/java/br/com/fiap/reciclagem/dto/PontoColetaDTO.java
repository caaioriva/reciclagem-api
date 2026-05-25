package br.com.fiap.reciclagem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PontoColetaDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String endereco;

    @NotBlank
    private String tipoResiduo;

    @NotNull
    @Positive
    private Integer capacidade;

    @NotNull
    private Integer ativo;
}