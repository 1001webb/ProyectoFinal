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

/**
 *
 * @author chris
 */
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    
    public List<Empleado> findByCedulaContaining(String cedula);

    public List<Empleado> findByNombreCompletoContainingIgnoreCase(String nombreCompleto);
    
    //public Optional<List<Empleado>> findById(Long id);
    
    
//        @Query("select u from Usuario u where UPPER(u.nombreCompleto) like CONCAT('%',UPPER(:nombreCompleto),'%')\"") 
//        public Usuario findNombreCompletoWithLikeSQL(@Param("nombreCompleto")String nombreCompleto);

 
}

