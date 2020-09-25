package org.una.aeropuerto.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 *
 * @author Sergio
 */
@Entity
@Table(name = "gastos_mantenientos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Gasto_Mantenimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_registro", updatable = false)
    @Temporal(TemporalType.DATE)
    @Setter(AccessLevel.NONE)
    private Date fechaRegistro;
     
    @Column
    private boolean estado;

    @Column(name = "proveedor")
    private String proveedor; 
    
    @Column(name = "tipo_servicio")
    private String tipoServicio; 
   
    @Column(name = "numero_contrato")
    private Long numero_contrato; 
    
    @Column (name = "duración ")
    private String duracion;
    
    @Column (name = "periodisidad")
    private String periodisidad;
    
    @Column (name = "observacio")
    private String observacion;

    @Column (name = "tipo_mantenimiento")
    private String tipo_mantenimiento;
    
    @ManyToOne 
    @JoinColumn(name="area_id")
    private Area area_id;
    
    private static final long serialVersionUID = 1L;

        @PrePersist
        public void prePersist() {
            estado=true;
            fechaRegistro = new Date();
        }

}

