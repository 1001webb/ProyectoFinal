package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.AccionRegistro;

/**
 *
 * @author chris
 */
public interface IAccionRegistroRepository extends JpaRepository<AccionRegistro, Long> {

    public List<AccionRegistro> findByUsuarioId(Long id);
 
}

