package org.una.aeropuerto.DTO;

import java.util.Date;
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
public class IncidenteDTO {
 
    private Long id; 
    private String nombreCompleto;   
    private String cedula; 
    private boolean estado; 
    private Date fechaRegistro;
     
}

