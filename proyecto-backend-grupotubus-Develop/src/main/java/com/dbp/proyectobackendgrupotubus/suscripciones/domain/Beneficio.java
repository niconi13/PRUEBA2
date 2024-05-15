package com.dbp.proyectobackendgrupotubus.suscripciones.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "beneficios")
public class Beneficio{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_beneficio;

    @Column(name = "detalle", nullable = false)
    private String detalle;

    @ManyToMany(mappedBy = "beneficios")
    private Set<Suscripcion> suscripciones;

}
