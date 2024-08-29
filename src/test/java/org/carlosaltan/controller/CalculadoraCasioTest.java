package org.carlosaltan.controller;

import org.carlosaltan.excepciones.ExcepcionDivisionCero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class CalculadoraCasioTest {

    @InjectMocks
    private CalculadoraCasio calculadoraCasio;
    @BeforeEach
    void setUp() {
        calculadoraCasio = new CalculadoraCasio(25.0, 5.0, "+");
    }

    @Test
    void calcularResultadoSuma() throws ExcepcionDivisionCero {
        calculadoraCasio = spy(calculadoraCasio);
        String resultado = calculadoraCasio.calcularResultado();
        assertEquals("El resultado es: 30.0", resultado);
    }
    @Test
    void calcularResultadoResta() throws ExcepcionDivisionCero {
        calculadoraCasio.setSigno("-");
        String resultado = calculadoraCasio.calcularResultado();
        assertEquals("El resultado es: 20.0", resultado);
    }
    @Test
    void calcularResultadoMultiplicacion() throws ExcepcionDivisionCero {
        calculadoraCasio.setSigno("*");
        String resultado = calculadoraCasio.calcularResultado();
        assertEquals("El resultado es: 125.0", resultado);
    }
    @Test
    void calcularResultadoDivision() throws ExcepcionDivisionCero {
        calculadoraCasio.setSigno("/");
        String resultado = calculadoraCasio.calcularResultado();
        assertEquals("El resultado es: 5.0", resultado);
    }
}