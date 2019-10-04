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
@Table(name = "alumno")
public class Alumno {
    @Id
    private Long dni_alu;

    @Column(name = "apellido")
    private String apellido;

    @Column(name="nombre")
    private String nombre;

    @Column(name = "dirección")
    private String dirección;


}
