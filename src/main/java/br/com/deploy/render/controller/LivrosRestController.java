package br.com.deploy.render.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.deploy.render.model.Livro;
import br.com.deploy.render.repository.LivrosRepository;

// Controlador para lidar com as APIs REST
@RestController
public class LivrosRestController {
    @Autowired
    LivrosRepository livrosRepository;

    @GetMapping("/livros")
    public List<Livro> list() {
        return (List<Livro>) this.livrosRepository.findAll();
    }

    @PostMapping("/novoLivro")
    public Livro addLivro(@RequestBody Livro livro) {
        return this.livrosRepository.save(livro);
    }
}