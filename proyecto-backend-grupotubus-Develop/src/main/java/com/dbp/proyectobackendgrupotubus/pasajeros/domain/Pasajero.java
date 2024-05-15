package com.dbp.proyectobackendgrupotubus.pasajeros.domain;

import com.dbp.proyectobackendgrupotubus.buses.Bus;
import com.dbp.proyectobackendgrupotubus.usuarios.domain.Usuario;
import com.dbp.proyectobackendgrupotubus.viajes.domain.Viaje;
import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "pasajeros")
public class Pasajero extends Usuario {

    @OneToMany(mappedBy = "pasajeros")
    private List<Viaje> viajes = new ArrayList<>();

    public Pasajero(){}

    public Pasajero(int id_usuario, String dni, String nombre, String apellido, String correo, ZonedDateTime fecha_creacion, String contrasenia, ZonedDateTime fecha_actualizacion) {
        super(id_usuario, dni, nombre, apellido, correo, fecha_creacion, contrasenia, fecha_actualizacion);
    }

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "busesFavoritos",
            joinColumns = {@JoinColumn(name = "id_usuario")},
            inverseJoinColumns = {@JoinColumn(name = "id_bus")}
    )
    private Set<Bus> buses;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private Pasajero pasajeros;

    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Viaje> viajesPasajero;

}