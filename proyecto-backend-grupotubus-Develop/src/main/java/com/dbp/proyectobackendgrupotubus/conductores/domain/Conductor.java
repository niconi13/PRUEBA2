package com.dbp.proyectobackendgrupotubus.conductores.domain;

import com.dbp.proyectobackendgrupotubus.buses.Bus;
import com.dbp.proyectobackendgrupotubus.empresas.Empresa;
import com.dbp.proyectobackendgrupotubus.usuarios.domain.Usuario;
import com.dbp.proyectobackendgrupotubus.viajes.domain.Viaje;
import jakarta.persistence.*;


import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "conductores")
public class Conductor extends Usuario {
    private String licencia;

    public Conductor() {
        super();
    }
    public Conductor(long id_usuario, String dni, String nombre, String apellido, String correo, ZonedDateTime fecha_creacion, String contrasenia, ZonedDateTime fecha_actualizacion, String licencia) {
        super(id_usuario, dni, nombre, apellido, correo, fecha_creacion, contrasenia, fecha_actualizacion);
        this.licencia = licencia;
    }

    @ManyToOne()
    @JoinColumn(name = "id_empresa")
    private Empresa empresas;


    @ManyToMany(mappedBy = "conductoresBus")
    private Set<Bus> buses;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "conductores")
    private List<Viaje> ConductorViaje;


}
