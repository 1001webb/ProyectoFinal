
package org.una.aeropuerto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

/**
 *
 * @author chris
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class HorarioDTO {
 
    private Long id;   
    private String dia; 
    private Date horaEntrada; 
    private Date horaSalida; 
    private Long empleadoId;
     
}

