package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Gasto_Mantenimiento;

/**
 *
 * @author Sergio
 */
public interface IGasto_MantenimientoService {
    
    public Optional<List<Gasto_Mantenimiento>>findAll();
    
    public Optional<Gasto_Mantenimiento> findById(Long id); 
    
     public Gasto_Mantenimiento create (Gasto_Mantenimiento gasto_mantenimiento);
    
    public Optional<Gasto_Mantenimiento>update(Gasto_Mantenimiento gasto_mantenimiento,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
}
