package org.una.aeropuerto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Parametro_Sistema;

/**
 *
 * @author Sergio
 */
public interface IParametro_SistemaRepository extends JpaRepository<Parametro_Sistema, Long> {
    
}
