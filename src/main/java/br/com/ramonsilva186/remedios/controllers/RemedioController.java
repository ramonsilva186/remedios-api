package br.com.ramonsilva186.remedios.controllers;

import br.com.ramonsilva186.remedios.remedio.DadosCadastroRemedio;
import br.com.ramonsilva186.remedios.remedio.Remedio;
import br.com.ramonsilva186.remedios.remedio.RemedioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    private RemedioRepository repository;

    public RemedioController(RemedioRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
        repository.save(new Remedio(dados));
    }
}
