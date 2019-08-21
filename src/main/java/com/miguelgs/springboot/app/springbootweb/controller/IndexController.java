package com.miguelgs.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import com.miguelgs.springboot.app.springbootweb.models.Usuario;
/**
 * IndexController
 */
@Controller
@RequestMapping("/app") //ruta de primer nivel, las rutas de los metodos tienen que pasar por esta, ej: localhost:8080/app/index
public class IndexController {
    //requestMapping puede mapear una funcion a varias rutas
    //Se puede usar GetMapping o PostMapping ...
    @RequestMapping(value = {"/index","/","","/home"}, method = RequestMethod.GET)
    public String index(Model model){//para pasar datos a la vista, Model o ModelMap o Map<String,Object> o ModelAndViewtrabaja con un mapa de Java
        model.addAttribute("titulo", "Hola Spring Framework 2");//añade el atributo de nombre "titulo" y valor ...,addAtribute para Model o ModelMap, put para Map
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario user=new Usuario("Miguel","González");
        user.setEmail("email@gmail.com");
        model.addAttribute("user", user);
        model.addAttribute("titulo", "Perfil");
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios= new ArrayList<>();
        usuarios.add(new Usuario("Miguel","Gonzalez","mg@gmail.com"));
        usuarios.add(new Usuario("Maria","Torres","to@gmail.com"));
        usuarios.add(new Usuario("Pepe","Bar"));
        model.addAttribute("titulo", "Listado de usuario");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }

    //Con el modelAttribute conseguimos agregar un atributo a todos los modelos del controlador
    //en este caso estarían disponibles en /index /perfil y /listar
    @ModelAttribute("usuarios2")
    public List<Usuario> rellenarUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        usuarios.add(new Usuario("Miguel","Gonzalez","mg@gmail.com"));
        usuarios.add(new Usuario("Maria","Torres","to@gmail.com"));
        usuarios.add(new Usuario("Pepe","Bar"));
        return usuarios;
    }
    
}