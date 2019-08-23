package com.miguelgs.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamController {
    @GetMapping("/")
    public String index(){

        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(defaultValue = "ningun parametro") String texto,Model model){
        model.addAttribute("respuesta", "El parametro enviado es: "+texto);
        return "params/ver";
    }
    
    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo,@RequestParam Integer numero ,Model model){
        model.addAttribute("respuesta", "El parametro enviado es: "+saludo+" y el numero es "+numero);
        return "params/ver";
    }
}