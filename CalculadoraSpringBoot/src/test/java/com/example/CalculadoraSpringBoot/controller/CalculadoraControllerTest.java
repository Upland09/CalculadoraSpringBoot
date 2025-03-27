package com.example.CalculadoraSpringBoot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalculadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void sumarEndpointTest() throws Exception {
        mockMvc.perform(get("/api/calculadora/sumar?a=2&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5.0"));
    }


}