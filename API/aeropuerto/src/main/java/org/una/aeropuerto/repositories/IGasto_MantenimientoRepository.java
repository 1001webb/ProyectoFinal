/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Gasto_Mantenimiento;

/**
 *
 * @author expz
 */
public interface IGasto_MantenimientoRepository extends JpaRepository<Gasto_Mantenimiento, Long> {
    
    public List<Gasto_Mantenimiento> findByNumeroContrato(Long numero_contrato);
}
