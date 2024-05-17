package br.com.deploy.render.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import br.com.deploy.render.repository.LivrosRepository;

import br.com.deploy.render.model.Livro;

// Controlador para lidar com as visualizações
@Controller
public class LivrosController {
    @Autowired
    LivrosRepository livrosRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String getMethodName(@RequestParam String param) {
        return "index";
    }

    @PostMapping("/novoLivro")
    public ModelAndView create(@RequestBody Livro livro) {
        ModelAndView modelAndView = new ModelAndView("index");
        livrosRepository.save(livro);
        return modelAndView;
    }

}
