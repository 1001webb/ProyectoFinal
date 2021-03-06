/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.aeropuerto.entities.Horario;
import org.una.aeropuerto.repositories.IHorarioRepository;

/**
 *
 * @author chris
 */
@Service
public class HorarioServiceImplementation implements IHorarioService {
    
    @Autowired
    private IHorarioRepository horarioRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Horario> findById(Long id) {
        return horarioRepository.findById(id);
    }
    
    @Override
    @Transactional
    public Horario create(Horario horario) {
        return horarioRepository.save(horario);
    }

    @Override
    @Transactional
    public Optional<Horario> update(Horario horario, Long id) {
        if (horarioRepository.findById(id).isPresent()) {
            return Optional.ofNullable(horarioRepository.save(horario));
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {

        horarioRepository.deleteById(id);
    }

}
