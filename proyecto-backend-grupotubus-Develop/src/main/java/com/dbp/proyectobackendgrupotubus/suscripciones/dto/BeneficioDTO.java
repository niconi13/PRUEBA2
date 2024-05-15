package com.dbp.proyectobackendgrupotubus.suscripciones.dto;

import java.util.Set;

public class BeneficioDTO {
    String detalle;

    Set<SuscripcionDTO> suscripciones;

    public String getDetalle() {
        return detalle;
    }

    public Set<SuscripcionDTO> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(Set<SuscripcionDTO> suscripciones) {
        this.suscripciones = suscripciones;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
