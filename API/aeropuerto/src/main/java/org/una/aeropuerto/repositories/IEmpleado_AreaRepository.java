package org.una.aeropuerto.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Empleado_Area;

/**
 *
 * @author Sergio
 */
public interface IEmpleado_AreaRepository extends JpaRepository<Empleado_Area, Long> {
    
    public Optional<List<Empleado_Area>> findByEmpleadoId(Long id);
    
}
