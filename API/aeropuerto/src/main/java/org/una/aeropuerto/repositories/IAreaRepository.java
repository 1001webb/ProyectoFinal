package org.una.aeropuerto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.aeropuerto.entities.Area;

/**
 *
 * @author expz
 */
public interface IAreaRepository extends JpaRepository<Area, Long> {

    public List<Area> findByAreaId(Long id);
    public List<Area> findByEstdo(boolean estado);
    
//        @Query("select u from Usuario u where UPPER(u.nombreCompleto) like CONCAT('%',UPPER(:nombreCompleto),'%')\"") 
//        public Usuario findNombreCompletoWithLikeSQL(@Param("nombreCompleto")String nombreCompleto);

 
}

