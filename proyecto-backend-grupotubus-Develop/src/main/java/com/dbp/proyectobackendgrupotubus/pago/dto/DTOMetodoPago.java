package com.dbp.proyectobackendgrupotubus.pago.dto;

public class DTOMetodoPago {
    String tipo;

    public DTOMetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
