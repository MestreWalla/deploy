package br.com.deploy.render.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Controlador para lidar com as visualizações
@Controller
public class LivrosController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String getMethodName(@RequestParam String param) {
        return "index";
    }
    
}

