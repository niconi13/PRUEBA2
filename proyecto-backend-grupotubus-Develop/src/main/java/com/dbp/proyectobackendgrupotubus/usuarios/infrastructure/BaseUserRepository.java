package com.dbp.proyectobackendgrupotubus.usuarios.infrastructure;

import com.dbp.proyectobackendgrupotubus.usuarios.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseUserRepository<T extends Usuario> extends JpaRepository<T, Long> {
}
