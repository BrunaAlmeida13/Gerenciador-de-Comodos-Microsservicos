package br.edu.infnet.gerenciadordecomodos.resources.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AparelhoDTO {

    private Long id;
    private String nome;
    private String status;
}
