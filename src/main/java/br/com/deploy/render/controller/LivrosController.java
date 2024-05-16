package br.com.deploy.render.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controlador para lidar com as visualizações
@Controller
public class LivrosController {
    @GetMapping("/")
    public String home() {
        return "index"; // Certifique-se de que há um arquivo index.html na pasta templates
    }
}

