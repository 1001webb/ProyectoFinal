package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Gasto_Mantenimiento;
import org.una.aeropuerto.repositories.IGasto_MantenimientoRepository;



/**
 *
 * @author Sergio
 */
public class Gasto_MantenimientoServiceImplementation implements IGasto_MantenimientoService{
    
    @Autowired
    private IGasto_MantenimientoRepository gasto_MantenimientoRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Gasto_Mantenimiento>> findAll() {
        return Optional.ofNullable(gasto_MantenimientoRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Gasto_Mantenimiento> findById(Long id) {
        return gasto_MantenimientoRepository.findById(id);
    }

   

    @Override
    @Transactional
    public Gasto_Mantenimiento create(Gasto_Mantenimiento gasto_Mantenimiento) {
        return gasto_MantenimientoRepository.save(gasto_Mantenimiento);
    }

    @Override
    @Transactional
    public Optional<Gasto_Mantenimiento> update(Gasto_Mantenimiento empleado_Area, Long id) {
        if (gasto_MantenimientoRepository.findById(id).isPresent()) {
            return Optional.ofNullable(gasto_MantenimientoRepository.save(empleado_Area));
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {

        gasto_MantenimientoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        gasto_MantenimientoRepository.deleteAll();
    }
}
