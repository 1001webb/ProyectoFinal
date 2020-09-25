package org.una.aeropuerto.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Sergio
 */
@Entity
@Table(name = "incidentes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Incidente implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 100)
    private String nombre;
    
    @Column(length = 100, name = "descripcion")
    private String descripcion;
    
    @Column (name = "responsable", length = 100)
    private String responsable;
    
    @Column (name = "estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn (name = "empleado_area_id")
    private Empleado_Area empleado_area_id;
    
}
