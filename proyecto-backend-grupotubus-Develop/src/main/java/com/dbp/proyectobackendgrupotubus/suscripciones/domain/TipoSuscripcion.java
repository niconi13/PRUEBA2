package com.dbp.proyectobackendgrupotubus.suscripciones.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "TipoSuscripcion")
public class TipoSuscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipoSuscripcion;

    @Column(name = "tipo_suscripcion", nullable = false)
    private String tipo_suscripcion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "tipoSuscripcion")
    private Set<HistorialPrecios> historialPrecios;

}
