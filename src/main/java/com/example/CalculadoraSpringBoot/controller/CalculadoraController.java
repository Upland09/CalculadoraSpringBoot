package com.example.CalculadoraSpringBoot.controller;

import com.example.CalculadoraSpringBoot.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/sumar")
    public double sumar(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.sumar(a, b);
    }

    @GetMapping("/restar")
    public double restar(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.restar(a, b);
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.dividir(a, b);
    }
}
