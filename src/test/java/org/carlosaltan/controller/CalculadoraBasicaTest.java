package org.carlosaltan.controller;

import org.carlosaltan.excepciones.ExcepcionDivisionCero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculadoraBasicaTest {

    @InjectMocks
    private CalculadoraBasica calculadoraBasica;

    @BeforeEach
    void setUp() {
        calculadoraBasica = mock(CalculadoraBasica.class);
    }


    @Test
    void suma() {
        when(calculadoraBasica.getNumero1()).thenReturn(10.0);
        when(calculadoraBasica.getNumero2()).thenReturn(3.0);
        when(calculadoraBasica.suma()).thenCallRealMethod();
        Double suma = calculadoraBasica.suma();
        assertEquals(13.0, suma);
    }

    @Test
    void multiplicacion() {
        when(calculadoraBasica.getNumero1()).thenReturn(5.0);
        when(calculadoraBasica.getNumero2()).thenReturn(10.0);
        when(calculadoraBasica.multiplicacion()).thenCallRealMethod();
        Double multiplicacion = calculadoraBasica.multiplicacion();
        assertEquals(50.0, multiplicacion);

    }

    @Test
    void division() throws ExcepcionDivisionCero {
        when(calculadoraBasica.getNumero1()).thenReturn(50.0);
        when(calculadoraBasica.getNumero2()).thenReturn(10.0);
        when(calculadoraBasica.division()).thenCallRealMethod();
        Double division = calculadoraBasica.division();
        assertEquals(5.0, division);
    }

    @Test
    void resta() {
        when(calculadoraBasica.getNumero1()).thenReturn(25.0);
        when(calculadoraBasica.getNumero2()).thenReturn(10.0);
        when(calculadoraBasica.resta()).thenCallRealMethod();
        Double division = calculadoraBasica.resta();
        assertEquals(15.0, division);
    }
}