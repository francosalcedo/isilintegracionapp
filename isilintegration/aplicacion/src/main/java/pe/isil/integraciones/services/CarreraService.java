package pe.isil.integraciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.integraciones.models.Carrera;
import pe.isil.integraciones.repositories.CarreraRepository;

import java.util.List;

@Service
public class CarreraService {
    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> findAll(){
        return carreraRepository.findAll();
    }

    public Carrera find(Long id){return carreraRepository.getOne(id);}
    public void create(Carrera carrera){carreraRepository.save(carrera);}

}
