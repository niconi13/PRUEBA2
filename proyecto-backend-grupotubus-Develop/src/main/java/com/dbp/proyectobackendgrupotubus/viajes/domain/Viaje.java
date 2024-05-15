package com.dbp.proyectobackendgrupotubus.viajes.domain;

import com.dbp.proyectobackendgrupotubus.conductores.domain.Conductor;
import com.dbp.proyectobackendgrupotubus.pasajeros.domain.Pasajero;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime hora_inicio;
    private LocalTime hora_fin;
    private double longitud;
    private double latitud;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Pasajero pasajeros;

    @ManyToOne
    @JoinColumn(name = "id_conductor")
    private Conductor conductores;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private Pasajero pasajeroViaje;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private Conductor conductoresViaje;

}
