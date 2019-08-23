package com.miguelgs.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
    @GetMapping("/string/")
    public String index(Model model){
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variable(@PathVariable String texto,Model model) {//El nombre debe corresponder al de la anotacion
        model.addAttribute("texto", texto);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    public String variable(@PathVariable String texto,@PathVariable Integer numero,Model model) {//El nombre debe corresponder al de la anotacion
        model.addAttribute("texto", texto);
        model.addAttribute("numero", numero);
        return "variables/ver";
    }
}