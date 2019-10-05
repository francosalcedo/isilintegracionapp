package pe.isil.integraciones.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.integraciones.models.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer>  {
}
