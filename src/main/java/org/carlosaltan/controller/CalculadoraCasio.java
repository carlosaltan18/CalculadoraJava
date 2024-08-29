package org.carlosaltan.controller;

import org.carlosaltan.excepciones.ExcepcionDivisionCero;

public class CalculadoraCasio extends CalculadoraBasica{
     private String signo;

    public CalculadoraCasio() {}
    public CalculadoraCasio(Double numero1, Double numero2, String signo) {
        super(numero1, numero2);
        this.signo = signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String  calcularResultado() throws ExcepcionDivisionCero {
        String resultado = String.valueOf(signo.equals("+") ? suma() :
                                          signo.equals("-") ? resta():
                                          signo.equals("*") ? multiplicacion():
                                          signo.equals("/") ? division(): null);
        if(resultado.equals("null") ){
            return "Es necesario ingresar un operador valido, tales como: +, -, *, /";
        }
        return "El resultado es: " + resultado;
    }

}
