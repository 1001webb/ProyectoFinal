/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Empleado;
import org.una.aeropuerto.entities.Horario;

/**
 *
 * @author chris
 */
public interface IHorarioRepository extends JpaRepository<Horario, Long> {
    
    public Optional<Horario> findById(Long id);
 
}

