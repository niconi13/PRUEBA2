package com.dbp.proyectobackendgrupotubus.empresas.dto;

import com.dbp.proyectobackendgrupotubus.buses.dto.DTOBus;
import com.dbp.proyectobackendgrupotubus.conductores.domain.Conductor;
import com.dbp.proyectobackendgrupotubus.conductores.dto.DTOConductor;

import java.util.List;

public class DTOEmpresa {
    private String ruc;
    private String nombre;
    private String descripcion;

    List<DTOConductor> dtoConductors;

    List<DTOBus> dtoBuses;

    public DTOEmpresa(){};

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<DTOConductor> getDtoConductors() {
        return dtoConductors;
    }

    public void setDtoConductors(List<DTOConductor> dtoConductors) {
        this.dtoConductors = dtoConductors;
    }

    public List<DTOBus> getDtoBuses() {
        return dtoBuses;
    }

    public void setDtoBuses(List<DTOBus> dtoBuses) {
        this.dtoBuses = dtoBuses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
