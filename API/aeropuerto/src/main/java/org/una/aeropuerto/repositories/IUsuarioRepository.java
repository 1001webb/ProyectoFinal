/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.aeropuerto.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Usuario;

/**
 *
 * @author chris
 */
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    //public Usuario findByCedulaAndPasswordEncriptado(String cedula, String passwordEncriptado);
    
    public Optional<List<Usuario>> findByEmpleadoId(Long id);

    public Optional<List<Usuario>> findByPerfilId(Long id);
    
//        @Query("select u from Usuario u where UPPER(u.nombreCompleto) like CONCAT('%',UPPER(:nombreCompleto),'%')\"") 
//        public Usuario findNombreCompletoWithLikeSQL(@Param("nombreCompleto")String nombreCompleto);

 
}

