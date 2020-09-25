/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class EmpleadoDTO {
 
    private Long id; 
    private String nombreCompleto;   
    private String cedula; 
    private boolean estado; 
    private Date fechaRegistro; 
    private Date fechaModificacion; 
    private Long areaId; 
    private boolean jefe;
     
}

