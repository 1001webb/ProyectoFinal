package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Parametro_Sistema;
import org.una.aeropuerto.repositories.IParametro_SistemaRepository;

/**
 *
 * @author Sergio
 */
@Service
public class Parametro_SistemaServiceImplementation implements IParametro_SistemaService{
    
    @Autowired
    private IParametro_SistemaRepository parametro_SistemaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Parametro_Sistema>> findAll() {
        return Optional.ofNullable(parametro_SistemaRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Parametro_Sistema> findById(Long id) {
        return parametro_SistemaRepository.findById(id);
    }

   

    @Override
    @Transactional
    public Parametro_Sistema create(Parametro_Sistema parametro_Sistema) {
        return parametro_SistemaRepository.save(parametro_Sistema);
    }

    @Override
    @Transactional
    public Optional<Parametro_Sistema> update(Parametro_Sistema parametro_Sistema, Long id) {
        if (parametro_SistemaRepository.findById(id).isPresent()) {
            return Optional.ofNullable(parametro_SistemaRepository.save(parametro_Sistema));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        parametro_SistemaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        parametro_SistemaRepository.deleteAll();
    }
}
