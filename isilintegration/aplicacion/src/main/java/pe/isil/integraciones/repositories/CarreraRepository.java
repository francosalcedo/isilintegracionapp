package pe.isil.integraciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.integraciones.models.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}