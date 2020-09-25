package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Incidente;

/**
 *
 * @author Sergio
 */
public interface IIncidenteRepository extends JpaRepository<Incidente, Long>  {
    
    public List<Incidente> findByNombre(String nombre);
    
    public List<Incidente> findByEstdo(boolean estado);
}
