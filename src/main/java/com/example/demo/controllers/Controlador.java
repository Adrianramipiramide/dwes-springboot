package com.example.demo.controllers;

import com.example.demo.classes.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controlador {

    @GetMapping("/index")
    String inicio(){
        return "index";
    }

    @RequestMapping("/formulario")
    String form(){
        return "/formulario";
    }

    @PostMapping("/mostrarCoches")
    String mostrarCoches(Coche coche, Model model){
        System.out.println(coche);
        model.addAttribute("coche",coche);
        return "mostrarCoches";
    }
}