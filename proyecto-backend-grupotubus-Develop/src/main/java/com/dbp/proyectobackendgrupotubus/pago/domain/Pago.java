package com.dbp.proyectobackendgrupotubus.pago.domain;


import com.dbp.proyectobackendgrupotubus.suscripciones.domain.Suscripcion;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagos")
public class Pago{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_pago;

        @Column(name = "estado", nullable = false)
        private String estado;

        @Column(name = "fecha", nullable = false)
        private Date fecha;

        @Column(name = "monto", nullable = false)
        private Double monto;

        @JoinColumn(name = "id_metodopago")
        @OneToOne(fetch = FetchType.LAZY)
        private MetodoPago metodoPago;

        @OneToOne(mappedBy = "pagos", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
        private Suscripcion suscripciones;

        /* Getters and setters */
}
