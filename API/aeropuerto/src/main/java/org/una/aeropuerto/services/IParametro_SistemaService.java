package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Parametro_Sistema;

/**
 *
 * @author Sergio
 */
public interface IParametro_SistemaService {
    
    public Optional<List<Parametro_Sistema>>findAll();
    
    public Optional<Parametro_Sistema> findById(Long id); 
    
     public Parametro_Sistema create (Parametro_Sistema parametro_sistema);
    
    public Optional<Parametro_Sistema>update(Parametro_Sistema parametro_Sistema,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
}
