package br.com.ramonsilva186.remedios.controllers;

import br.com.ramonsilva186.remedios.remedio.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
        System.out.println(dados);
    }
}
