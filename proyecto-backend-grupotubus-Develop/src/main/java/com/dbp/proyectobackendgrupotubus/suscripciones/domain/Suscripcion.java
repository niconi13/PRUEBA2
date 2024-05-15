package com.dbp.proyectobackendgrupotubus.suscripciones.domain;

import com.dbp.proyectobackendgrupotubus.pago.domain.Pago;
import com.dbp.proyectobackendgrupotubus.pasajeros.domain.Pasajero;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "suscripciones")
public class Suscripcion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_suscripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fecha_inicio;


    @Column(name = "fecha_fin", nullable = false)
    private Date fecha_fin;

    @OneToMany(mappedBy = "suscripcion")
    private Set<HistorialPrecios> historialPrecios;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "BeneficiosPorSuscripcion",
            joinColumns = {@JoinColumn(name = "id_suscripcion")},
            inverseJoinColumns = {@JoinColumn(name = "id_beneficio")}
    )
    private Set<Beneficio> beneficios;

    @JoinColumn(name = "id_pago")
    @OneToOne(fetch = FetchType.LAZY)
    private Pago pagos;

    @OneToMany(mappedBy = "suscripcion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pasajero> pasajeroslista;

}
