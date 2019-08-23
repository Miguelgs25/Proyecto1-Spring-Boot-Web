package com.miguelgs.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){

        //return "redirect:/app/index";//redirige hacia un metodo o pagina, cambiando la ruta en el navegador y borrando los parametros
        return "forward:/app/index";//redirige hacia un metodo, no cambia la ruta en el navegador y no borra los parametros

    }
    
}