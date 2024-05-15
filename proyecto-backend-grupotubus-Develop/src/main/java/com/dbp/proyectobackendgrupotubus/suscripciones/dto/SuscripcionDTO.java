package com.dbp.proyectobackendgrupotubus.suscripciones.dto;

import com.dbp.proyectobackendgrupotubus.pago.dto.DTOPago;
import com.dbp.proyectobackendgrupotubus.pasajeros.dto.DTOPasajero;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class SuscripcionDTO {

    Date fechaInicio;
    Date fechaFin;

    Set<HistorialDePreciosDTO> historialPrecios;

    Set<BeneficioDTO> beneficioDTO;

    DTOPago pagos;

    List<DTOPasajero> pasajerosLista;
}
