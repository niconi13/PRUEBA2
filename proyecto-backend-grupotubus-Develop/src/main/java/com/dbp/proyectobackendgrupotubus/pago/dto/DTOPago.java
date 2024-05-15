package com.dbp.proyectobackendgrupotubus.pago.dto;

import java.util.Date;

public class DTOPago {

    String estado;

    Date fecha;

    Double monto;

    public DTOPago(String estado, Date fecha, Double monto) {
        this.estado = estado;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
