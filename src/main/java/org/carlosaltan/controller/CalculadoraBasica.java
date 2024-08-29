package org.carlosaltan.controller;

import org.carlosaltan.excepciones.ExcepcionDivisionCero;

public class CalculadoraBasica implements InterfazCalculadora{

    private Double numero1;
    private Double numero2;

    public CalculadoraBasica() {}

    public CalculadoraBasica(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public Double suma() {
        return getNumero1() + getNumero2();
    }
    @Override
    public Double multiplicacion(){
        return getNumero1() * getNumero2();
    }
    @Override
    public Double division() throws ExcepcionDivisionCero{
        if(getNumero2() == 0){
            throw new ExcepcionDivisionCero("Sintaxis Error, el denominadora no puede ser 0");
        }else {
            return getNumero1() / getNumero2();
        }

    }
    @Override
    public Double resta(){
        return getNumero1() - getNumero2();
    }

}
