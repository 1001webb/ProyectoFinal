package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Area;

/**
 *
 * @author Sergio
 */
public interface IAreaService {
    public Optional<List<Area>> findAll();
    
    public Optional<Area>findById(Long id);
    
    public Area create (Area area);
    
    public Optional<Area>update(Area area,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
    
}
