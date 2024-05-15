package com.dbp.proyectobackendgrupotubus.suscripciones.dto;

import java.util.Date;

public class HistorialDePreciosDTO {
    Double precio;

    Date fechaInicio;
    Date fechaFin;

    TipoSuscripcionDTO tipoSuscripcion;

    SuscripcionDTO suscripcion;

    public TipoSuscripcionDTO getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(TipoSuscripcionDTO tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public SuscripcionDTO getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(SuscripcionDTO suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
