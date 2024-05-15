package com.dbp.proyectobackendgrupotubus.empresas;

import com.dbp.proyectobackendgrupotubus.buses.Bus;
import com.dbp.proyectobackendgrupotubus.conductores.domain.Conductor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empresa;

    @Column(name = "ruc", nullable = false)
    private String ruc;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "empresas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Conductor> conductores;

    @OneToMany(mappedBy = "empresas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bus> busesEmpresa;

    /* Getters and setters */
    public Empresa() {}
}