package com.dbp.proyectobackendgrupotubus.conexionParaderos;

import java.io.Serializable;

public class ConexionParaderosId implements Serializable {
    private String origenRuta;
    private String destinoRuta;
    private int orden;
    private Long ruta;  // Suponiendo que ruta es parte de la clave
    private Long paradero;  // Suponiendo que paradero es parte de la clave

    // Constructor, getters, setters, equals, y hashCode

    public ConexionParaderosId() {
    }

    // Asegúrate de implementar los métodos equals y hashCode.
}
