package com.dbp.proyectobackendgrupotubus.buses;

import com.dbp.proyectobackendgrupotubus.conductores.domain.Conductor;
import com.dbp.proyectobackendgrupotubus.lineadebus.LineaBus;
import com.dbp.proyectobackendgrupotubus.pasajeros.domain.Pasajero;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Buses")
public class Bus{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bus;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "capacidad", nullable = false)
    private String capacidad;

    @ManyToMany(mappedBy = "buses")
    private Set<Pasajero> pasajerosbus;

    @ManyToOne()
    @JoinColumn(name = "id_lineaBus")
    private LineaBus lineabuses;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "BusDeConductor",
            joinColumns = {@JoinColumn(name = "id_bus")},
            inverseJoinColumns = {@JoinColumn(name = "id_usuario")}
    )
    private Set<Conductor> conductoresBus;


    /* Getters and setters */
}