package com.example.CalculadoraSpringBoot.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.CalculadoraSpringBoot.controller.CalculadoraController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CalculadoraServiceTest {

    @Mock
    private CalculadoraController operacionService;

    @InjectMocks
    private CalculadoraService calculadoraService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Inicializamos los mocks
    }

    @Test
    void sumarTest() {
        // Simulamos la respuesta del mock
        when(operacionService.sumar(2.0, 3.0)).thenReturn(5.0);

        double resultado = calculadoraService.sumar(2.0, 3.0);
        assertEquals(5.0, resultado);

        // Verificamos que el método del mock fue llamado
        verify(operacionService).sumar(2.0, 3.0);
    }



    @Test
    void dividirPorCeroTest() {
        assertThrows(ArithmeticException.class, () -> calculadoraService.dividir(5.0, 0.0));

        // No debe llamar a operacionService.dividir si se lanza la excepción antes
        verify(operacionService, never()).dividir(anyDouble(), eq(0.0));
    }
}