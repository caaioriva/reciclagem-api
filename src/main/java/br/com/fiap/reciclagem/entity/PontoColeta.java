package br.com.fiap.reciclagem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_PONTO_COLETA")
@Getter
@Setter
public class PontoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ponto_seq")
    @SequenceGenerator(
            name = "ponto_seq",
            sequenceName = "SEQ_PONTO_COLETA",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "ENDERECO", nullable = false, length = 255)
    private String endereco;

    @Column(name = "TIPO_RESIDUO", nullable = false, length = 80)
    private String tipoResiduo;

    @Column(name = "CAPACIDADE", nullable = false)
    private Integer capacidade;

    @Column(name = "ATIVO", nullable = false)
    private Integer ativo = 1;
}