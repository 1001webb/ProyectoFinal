package org.una.aeropuerto.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author expz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class CategoriaDTO {
 
    private Long id; 
    private String nombreCompleto;   
    private String cedula; 
    private boolean estado; 
     
}

