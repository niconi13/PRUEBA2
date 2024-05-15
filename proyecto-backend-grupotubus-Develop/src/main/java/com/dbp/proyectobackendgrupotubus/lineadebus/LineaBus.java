package com.dbp.proyectobackendgrupotubus.lineadebus;
import com.dbp.proyectobackendgrupotubus.buses.Bus;
import com.dbp.proyectobackendgrupotubus.paraderos.domain.Paradero;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lineaBuses")
public class LineaBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_lineaBus;

    @Column(name = "codigo_bus", nullable = false)
    private String codigo_bus;

    @OneToMany(mappedBy = "lineaBus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bus> buses;


    /* Getters and setters */
}
