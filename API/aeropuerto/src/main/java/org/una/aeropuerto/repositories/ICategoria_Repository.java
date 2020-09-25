package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Categoria;

/**
 *
 * @author Sergio
 */
public interface ICategoria_Repository extends JpaRepository<Categoria, Long> {
    
    public List<Categoria> findByNombre(String nombre);
}
