package com.example.demo.controllers;

import com.example.demo.classes.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;

@Controller
public class Controlador {

    public ArrayList<Coche> listaCoches = new ArrayList<>();

    @GetMapping("/index")
    String inicio() {
        return "index";
    }

    @RequestMapping("/formulario")
    String form() {
        return "formulario";
    }

    @PostMapping("/crearCoche")
    String crearCoche(Coche coche, Model model) {
        listaCoches.add(coche);
        System.out.println(coche);
        model.addAttribute("coches", listaCoches);
        return "mostrarCoches";
    }

    @GetMapping("/mostrarCoches")
    String mostrarCoches(Model model){
        model.addAttribute("coches", listaCoches);
        return "mostrarCoches";
    }
}