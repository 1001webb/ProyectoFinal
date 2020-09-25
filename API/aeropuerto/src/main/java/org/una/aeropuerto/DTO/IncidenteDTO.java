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
    private String nombre;
    private String descripcion;
    private String responsable;
    private boolean estado;
     private Long empleado_area_id;
     
}

