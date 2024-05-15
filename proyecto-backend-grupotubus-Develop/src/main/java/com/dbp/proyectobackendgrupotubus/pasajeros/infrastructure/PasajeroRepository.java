package com.dbp.proyectobackendgrupotubus.pasajeros.infrastructure;

import jakarta.transaction.Transactional;
import com.dbp.proyectobackendgrupotubus.pasajeros.domain.Pasajero;
import com.dbp.proyectobackendgrupotubus.usuarios.infrastructure.BaseUserRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PasajeroRepository extends BaseUserRepository<Pasajero> {
}