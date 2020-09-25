package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Categoria;
import org.una.aeropuerto.repositories.ICategoria_Repository;

/**
 *
 * @author Sergio
 */
@Service
public class CategoriaServiceImplementation implements ICategoriaService{
    
    @Autowired
    private ICategoria_Repository categoria_Repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Categoria>> findAll() {
        return Optional.ofNullable(categoria_Repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> findById(Long id) {
        return categoria_Repository.findById(id);
    }

   

    @Override
    @Transactional
    public Categoria create(Categoria categoria) {
        return categoria_Repository.save(categoria);
    }

    @Override
    @Transactional
    public Optional<Categoria> update(Categoria categoria, Long id) {
        if (categoria_Repository.findById(id).isPresent()) {
            return Optional.ofNullable(categoria_Repository.save(categoria));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        categoria_Repository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        categoria_Repository.deleteAll();
    }
}
