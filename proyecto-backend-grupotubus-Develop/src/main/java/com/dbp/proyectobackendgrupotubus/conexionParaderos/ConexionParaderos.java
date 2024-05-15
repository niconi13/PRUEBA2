package com.dbp.proyectobackendgrupotubus.conexionParaderos;

import com.dbp.proyectobackendgrupotubus.lineadebus.LineaBus;
import com.dbp.proyectobackendgrupotubus.paraderos.domain.Paradero;
import com.dbp.proyectobackendgrupotubus.rutas.domain.Ruta;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "conexionParaderos")
@IdClass(ConexionParaderosId.class)
public class ConexionParaderos {
    @Id
    @Column(name = "origen_ruta")
    private String origenRuta;

    @Id
    @Column(name = "destino_ruta")
    private String destinoRuta;

    @Id
    @Column(name = "orden")
    private int orden;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_paradero")
    private Paradero paradero;

    @OneToMany(mappedBy = "conexionParaderos", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LineaBus> lineaBusesYParaderos;
    // Constructor, getters y setters
}
