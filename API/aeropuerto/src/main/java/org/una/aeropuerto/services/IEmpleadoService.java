/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Empleado;
/**
 *
 * @author chris
 */
public interface IEmpleadoService {
    
     public Optional<Empleado> findById(Long id);
     
     public Optional<List<Empleado>> findByCedulaAproximate(String cedula);
     
     public Empleado create(Empleado empleado);
     
     public void delete(Long id);
    
}
