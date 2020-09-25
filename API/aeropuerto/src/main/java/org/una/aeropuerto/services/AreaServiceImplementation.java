package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Area;
import org.una.aeropuerto.repositories.IAreaRepository;

/**
 *
 * @author Sergio
 */
@Service
public class AreaServiceImplementation implements IAreaService{
    
    @Autowired
    private IAreaRepository areaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Area>> findAll() {
        return Optional.ofNullable(areaRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Area> findById(Long id) {
        return areaRepository.findById(id);
    }

   

    @Override
    @Transactional
    public Area create(Area usuario) {
        return areaRepository.save(usuario);
    }

    @Override
    @Transactional
    public Optional<Area> update(Area area, Long id) {
        if (areaRepository.findById(id).isPresent()) {
            return Optional.ofNullable(areaRepository.save(area));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        areaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        areaRepository.deleteAll();
    }

}
