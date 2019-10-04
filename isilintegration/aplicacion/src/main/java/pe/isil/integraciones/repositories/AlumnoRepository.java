package pe.isil.integraciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.integraciones.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
