/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.service;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.AccionRegistro;

/**
 *
 * @author chris
 */
public interface IAccionRegistroService {
    
    public Optional<List<AccionRegistro>> findAll();
    
    public Optional<AccionRegistro> findById(Long id);
    
    public Optional<AccionRegistro> findByNombre(String nombre);
    
    public AccionRegistro create(AccionRegistro accionRegistro);
    
    public void delete(Long id);
}
