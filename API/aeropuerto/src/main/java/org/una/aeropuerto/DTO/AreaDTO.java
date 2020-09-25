package org.una.aeropuerto.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Sergio
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class AreaDTO {
 
    private Long id; 
    private String nombre;
    private boolean estado; 
     
}

