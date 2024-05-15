package com.dbp.proyectobackendgrupotubus.viajes.infrastructure;

import com.dbp.proyectobackendgrupotubus.pasajeros.domain.Pasajero;
import com.dbp.proyectobackendgrupotubus.viajes.domain.Viaje;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public class ViajeRepository extends JpaRepository<Viaje, Long> {
    Page<Viaje> findAllByPasajeroId(Long pasajero_id, Pageable pageable);
}