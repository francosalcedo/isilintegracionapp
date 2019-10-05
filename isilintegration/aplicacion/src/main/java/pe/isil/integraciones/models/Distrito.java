package pe.isil.integraciones.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "distrito")
public class Distrito {
    @Id
    private int idDistrito;

    @Column(name = "nombre")
    private String nombre;

}
