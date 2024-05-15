package com.dbp.proyectobackendgrupotubus.paraderos.dto;

public class ParaderoDTO {
    String nombre;

    public ParaderoDTO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
