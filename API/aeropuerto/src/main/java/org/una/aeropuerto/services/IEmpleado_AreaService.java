package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Empleado_Area;

/**
 *
 * @author Sergio
 */
public interface IEmpleado_AreaService {
    
    public Optional<List<Empleado_Area>>findAll();
    
    public Optional<Empleado_Area> findById(Long id); 
    
     public Empleado_Area create (Empleado_Area empleado_Area);
    
    public Optional<Empleado_Area>update(Empleado_Area empleado_Area,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
}
