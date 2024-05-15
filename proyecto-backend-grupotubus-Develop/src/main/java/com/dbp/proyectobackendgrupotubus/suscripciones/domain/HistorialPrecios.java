package com.dbp.proyectobackendgrupotubus.suscripciones.domain;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "HistorialPrecios")
public class HistorialPrecios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_tipoSuscripcion")
    private TipoSuscripcion tipoSuscripcion;

    @ManyToOne
    @JoinColumn(name = "id_suscripcion")
    private Suscripcion suscripcion;

    // Getters y setters
}