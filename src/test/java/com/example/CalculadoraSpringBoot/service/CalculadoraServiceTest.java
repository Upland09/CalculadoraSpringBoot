package com.example.CalculadoraSpringBoot.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void sumarTest() {
        assertEquals(5.0, calculadoraService.sumar(2.0, 3.0));
    }

    @Test
    void dividirPorCeroTest() {
        assertThrows(ArithmeticException.class, () -> calculadoraService.dividir(5.0, 0.0));
    }
}