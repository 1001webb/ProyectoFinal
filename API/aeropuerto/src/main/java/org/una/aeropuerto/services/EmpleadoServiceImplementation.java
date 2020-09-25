/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Empleado;
import org.una.aeropuerto.repositories.IEmpleadoRepository;

/**
 *
 * @author chris
 */
@Service
public class EmpleadoServiceImplementation implements IEmpleadoService {
    
    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<List<Empleado>> findByCedulaAproximate(String cedula) {
        return Optional.ofNullable(empleadoRepository.findByCedulaContaining(cedula));
    }

    @Override
    @Transactional
    public Empleado create(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Transactional
    public Optional<Empleado> update(Empleado empleado, Long id) {
        if (empleadoRepository.findById(id).isPresent()) {
            return Optional.ofNullable(empleadoRepository.save(empleado));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        empleadoRepository.deleteById(id);
    }

}
