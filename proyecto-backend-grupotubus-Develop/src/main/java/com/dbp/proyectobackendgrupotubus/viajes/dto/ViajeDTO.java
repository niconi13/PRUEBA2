package com.dbp.proyectobackendgrupotubus.viajes.dto;

import com.dbp.proyectobackendgrupotubus.conductores.dto.DTOConductor;
import com.dbp.proyectobackendgrupotubus.pasajeros.dto.DTOPasajero;

import java.time.LocalTime;

public class ViajeDTO {
    LocalTime hora_inicio;
    LocalTime hora_fin;

    double longitud;
    double latitud;

    DTOPasajero pasajeroViaje;

    DTOConductor conductoresViaje;

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public DTOPasajero getPasajeroViaje() {
        return pasajeroViaje;
    }

    public void setPasajeroViaje(DTOPasajero pasajeroViaje) {
        this.pasajeroViaje = pasajeroViaje;
    }

    public DTOConductor getConductoresViaje() {
        return conductoresViaje;
    }

    public void setConductoresViaje(DTOConductor conductoresViaje) {
        this.conductoresViaje = conductoresViaje;
    }
}
