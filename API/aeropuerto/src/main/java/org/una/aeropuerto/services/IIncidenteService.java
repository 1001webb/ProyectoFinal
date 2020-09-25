package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Incidente;

/**
 *
 * @author Sergio
 */
public interface IIncidenteService {
    
    public Optional<List<Incidente>>findAll();
    
    public Optional<Incidente> findById(Long id); 
    
     public Incidente create (Incidente incidente);
    
    public Optional<Incidente>update(Incidente incidente,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
}
