package org.carlosaltan.controller;

import org.carlosaltan.excepciones.ExcepcionDivisionCero;

public interface InterfazCalculadora {

    public Double suma();

    public Double multiplicacion();

    public Double division() throws ExcepcionDivisionCero;

    public Double resta();
}
