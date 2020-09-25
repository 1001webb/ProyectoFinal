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
import org.una.aeropuerto.entities.Perfil;
import org.una.aeropuerto.repositories.IPerfilRepository;

/**
 *
 * @author chris
 */
@Service
public class PerfilServiceImplementation implements IPerfilService {

    @Autowired
    private IPerfilRepository perfilRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<Perfil> findById(Long id) {
        return perfilRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Perfil>> findByNombreCompletoAproximateIgnoreCase(String nombre) {
        return Optional.ofNullable(perfilRepository.findByNombre(nombre));
    }

    @Override
    @Transactional
    public Perfil create(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

     @Override
    @Transactional
    public Optional<Perfil> update(Perfil perfil, Long id) {
        if (perfilRepository.findById(id).isPresent()) {
            return Optional.ofNullable(perfilRepository.save(perfil));
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {

        perfilRepository.deleteById(id);
    }


}
