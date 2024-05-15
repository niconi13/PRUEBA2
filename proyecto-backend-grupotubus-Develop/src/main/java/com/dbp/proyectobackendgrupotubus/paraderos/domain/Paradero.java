package com.dbp.proyectobackendgrupotubus.paraderos.domain;
import com.dbp.proyectobackendgrupotubus.rutas.domain.Ruta;
import jakarta.persistence.*;

import java.util.Set;

//Tabla Paradero
@Entity
@Table(name = "paraderos")
public class Paradero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_paradero;

    @Column(name = "nombre_paradero", nullable = false)
    private String nombre_paradero;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "conexion_paraderos",
            joinColumns = {@JoinColumn(name = "id_paradero")},
            inverseJoinColumns = {@JoinColumn(name = "id_ruta")}
    )
    private Set<Ruta> rutas;


    /* Getters and setters */
}
