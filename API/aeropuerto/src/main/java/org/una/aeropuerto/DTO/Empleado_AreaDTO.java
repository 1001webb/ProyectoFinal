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
public class Empleado_AreaDTO {
 
    private Long id;
    private Date fechaRegistro;
    private long empleado_id;
     
}

