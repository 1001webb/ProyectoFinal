package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Incidente;
import org.una.aeropuerto.repositories.IIncidenteRepository;

/**
 *
 * @author Sergio
 */
public class IncidenteServiceImplementation implements IIncidenteService{
    
    @Autowired
    private IIncidenteRepository incidenteRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Incidente>> findAll() {
        return Optional.ofNullable(incidenteRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Incidente> findById(Long id) {
        return incidenteRepository.findById(id);
    }

   

    @Override
    @Transactional
    public Incidente create(Incidente incidente) {
        return incidenteRepository.save(incidente);
    }

    @Override
    @Transactional
    public Optional<Incidente> update(Incidente incidente, Long id) {
        if (incidenteRepository.findById(id).isPresent()) {
            return Optional.ofNullable(incidenteRepository.save(incidente));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        incidenteRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        incidenteRepository.deleteAll();
    }
}
