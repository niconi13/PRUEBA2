package com.dbp.proyectobackendgrupotubus.buses.dto;

import com.dbp.proyectobackendgrupotubus.lineadebus.LineaBus;

public class DTOBus {

    private String placa;
    private String capacidad;


    public DTOBus(String placa, String capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
