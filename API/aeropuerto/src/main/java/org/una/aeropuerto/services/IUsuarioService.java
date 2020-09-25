/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.Optional;
import org.una.aeropuerto.entities.Usuario;

/**
 *
 * @author chris
 */
public interface IUsuarioService {
    
    public Optional<Usuario> findById(Long id);
    
    public Usuario create(Usuario usuario);
    
    public Optional<Usuario> update(Usuario usuario, Long id);

    public void delete(Long id);

    //public Optional<Usuario> login(Usuario usuario); 
} 
