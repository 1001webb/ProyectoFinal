/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.services;

import java.util.List;
import java.util.Optional;
import org.una.aeropuerto.entities.Hora_Marcaje;

/**
 *
 * @author chris
 */
public interface IHorasMarcajeService {
    
    public Optional<Hora_Marcaje> findById(Long id);
    
    public Hora_Marcaje create(Hora_Marcaje hora_entrada,Hora_Marcaje hora_salida);

    public void delete(Long id);
}
