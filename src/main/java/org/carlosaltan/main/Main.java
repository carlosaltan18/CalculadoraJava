package org.carlosaltan.main;
import org.carlosaltan.controller.CalculadoraCasio;
import org.carlosaltan.excepciones.ExcepcionDivisionCero;

public class Main {
    public static void main(String[] args) throws ExcepcionDivisionCero {
        CalculadoraCasio calculadora = new CalculadoraCasio();

        calculadora.setNumero1(10.0);
        calculadora.setNumero2(20.0);
        calculadora.setSigno("*");

        System.out.println(calculadora.calcularResultado());
    }
}