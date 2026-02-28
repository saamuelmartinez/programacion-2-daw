package com.example.demo.controller;

import com.example.demo.model.Asteroide;
import com.example.demo.service.ServicioAsteroide;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ControladorAsteroide {

    private final ServicioAsteroide servicioAsteroide;

    public ControladorAsteroide(ServicioAsteroide servicioAsteroide) {
        this.servicioAsteroide = servicioAsteroide;
    }

    @GetMapping("/")
    public String mostrarFormulario() {
        return "index";
    }

    @PostMapping("/resultado")
    public String obtenerResultado(@RequestParam("fecha") String fecha, Model modelo) {
        if (fecha == null || fecha.isEmpty()) {
            modelo.addAttribute("error", "La fecha no puede estar vacía.");
            return "index";
        }
        try {
            List<Asteroide> asteroides = servicioAsteroide.obtenerAsteroidesPeligrosos(fecha);
            modelo.addAttribute("asteroides", asteroides);
            modelo.addAttribute("fecha", fecha);
        } catch (Exception e) {
            modelo.addAttribute("error", "Error al conectar con la API de la NASA.");
            return "index";
        }
        return "resultado";
    }
}