package com.dbp.proyectobackendgrupotubus.pago.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "metodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_metodo_de_pago;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @OneToOne(mappedBy = "MetodoPago", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Pago pagos;

    /* Getters and setters */
}
