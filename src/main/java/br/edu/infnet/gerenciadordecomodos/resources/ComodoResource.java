package br.edu.infnet.gerenciadordecomodos.resources;

import br.edu.infnet.gerenciadordecomodos.resources.dto.ComodoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comodos")
public class ComodoResource {

    @PostMapping
    public void cadastraComodo(@RequestBody ComodoDTO comodoDTO) {
        System.out.println("Microservices!/n " + comodoDTO);
    }
}
