package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Parametro_Sistema;

/**
 *
 * @author Sergio
 */
public interface IParametro_SistemaRepository extends JpaRepository<Parametro_Sistema, Long> {
    
    public List<Parametro_Sistema> findByNombre(String nombre);
}
