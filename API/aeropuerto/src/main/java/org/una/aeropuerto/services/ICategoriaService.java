package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Categoria;

/**
 *
 * @author Sergio
 */
public interface ICategoriaService {
    
    public Optional<List<Categoria>>findAll();
    
    public Optional<Categoria> findById(Long id); 
    
     public Categoria create (Categoria categoria);
    
    public Optional<Categoria>update(Categoria categoria,Long id);
    
    public void delete(Long id);
    
    public void deleteAll();
}
