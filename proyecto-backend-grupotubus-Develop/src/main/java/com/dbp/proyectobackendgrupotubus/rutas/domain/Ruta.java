package com.dbp.proyectobackendgrupotubus.rutas.domain;
import com.dbp.proyectobackendgrupotubus.paraderos.domain.Paradero;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "rutas")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ruta;

    @Column(name = "nombre_ruta", nullable = false)
    private String nombre_ruta;

    @Column(name = "descripcion_ruta", nullable = false)
    private String descripcion_ruta;

    @ManyToMany(mappedBy = "rutas")
    private Set<Paradero> paraderos;

    /* Getters and setters */
}