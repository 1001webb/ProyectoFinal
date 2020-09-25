package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Empleado_Area;
import org.una.aeropuerto.repositories.IEmpleado_AreaRepository;

/**
 *
 * @author Sergio
 */
@Service
public class Empleado_AreaServiceImplementation implements IEmpleado_AreaService{
    
    @Autowired
    private IEmpleado_AreaRepository empleado_AreaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Empleado_Area>> findAll() {
        return Optional.ofNullable(empleado_AreaRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Empleado_Area> findById(Long id) {
        return empleado_AreaRepository.findById(id);
    }

   

    @Override
    @Transactional
    public Empleado_Area create(Empleado_Area empleado_Area) {
        return empleado_AreaRepository.save(empleado_Area);
    }

    @Override
    @Transactional
    public Optional<Empleado_Area> update(Empleado_Area empleado_Area, Long id) {
        if (empleado_AreaRepository.findById(id).isPresent()) {
            return Optional.ofNullable(empleado_AreaRepository.save(empleado_Area));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        empleado_AreaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        empleado_AreaRepository.deleteAll();
    }
}
