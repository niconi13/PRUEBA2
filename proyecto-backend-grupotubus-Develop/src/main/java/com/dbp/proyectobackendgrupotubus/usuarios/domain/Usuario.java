package com.dbp.proyectobackendgrupotubus.usuarios.domain;

import com.dbp.proyectobackendgrupotubus.viajes.domain.Viaje;
import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "Usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;

    @Column(name = "fecha_creacion", nullable = false)
    private ZonedDateTime fecha_creacion;

    @Column(name = "fecha_actualizacion")
    private ZonedDateTime fecha_actualizacion;

    @Transient
    private String rolePrefix = "ROLE";



    // Constructor, getters y setters

    public Usuario() {
    }

    public Usuario(long id_usuario, String dni, String nombre, String apellido, String correo, ZonedDateTime fecha_creacion, String contrasenia, ZonedDateTime fecha_actualizacion)
    {
        this.id_usuario = id_usuario;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha_creacion = fecha_creacion;
        this.contrasenia = contrasenia;
        this.fecha_actualizacion = fecha_actualizacion;
    }


}