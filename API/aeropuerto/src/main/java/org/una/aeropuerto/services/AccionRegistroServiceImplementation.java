package org.una.aeropuerto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.AccionRegistro;
import org.una.aeropuerto.repositories.IAccionRegistroRepository;

/**
 *
 * @author chris
 */
@Service
public class AccionRegistroServiceImplementation implements IAccionRegistroService {

    @Autowired
    private IAccionRegistroRepository accionRegistroRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<AccionRegistro>> findAll() {
        return Optional.ofNullable(accionRegistroRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AccionRegistro> findById(Long id) {
        return accionRegistroRepository.findById(id);
    }


    @Override
    @Transactional
    public AccionRegistro create(AccionRegistro accionRegistro) {
        return accionRegistroRepository.save(accionRegistro);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        accionRegistroRepository.deleteById(id);
    }

    @Override
    public Optional<AccionRegistro> findByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
