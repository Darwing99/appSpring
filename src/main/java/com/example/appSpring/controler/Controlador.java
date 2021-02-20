package com.example.appSpring.controler;
import java.util.List;
import com.example.appSpring.interfaceService.IPersonasService;
import com.example.appSpring.modelo.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IPersonasService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    
}
