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
public class Gasto_MantenimientoDTO {
 
    private Long id;
    private Date fechaRegistro;
    private boolean estado;
    private String proveedor;
    private String tipoServicio;
    private Long numero_contrato;
    
}
