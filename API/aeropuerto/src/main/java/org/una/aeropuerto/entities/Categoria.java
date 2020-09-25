package org.una.aeropuerto.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table (name = "categoria")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 100)
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorias")
    private List<Categoria> subcategorias = new ArrayList<>();
    
}
