package br.edu.infnet.gerenciadordecomodos.resources.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ComodoDTO {

    private String tipo;
    private String nome;
    private Long responsavelId;
    private List<AparelhoDTO> listaAparelhos;
}
