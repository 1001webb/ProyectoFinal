/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Perfil;

/**
 *
 * @author chris
 */
public interface IPerfilService {
    
    public Optional<List<Perfil>> findByNombreCompletoAproximateIgnoreCase(String nombre);
    
    public Optional<Perfil> findById(Long id);
    
    public Perfil create(Perfil perfil);
    
    public Optional<Perfil> update(Perfil perfil, Long id);
    
    public void delete(Long id);
}
