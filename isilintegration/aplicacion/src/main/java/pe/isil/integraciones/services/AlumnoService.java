package pe.isil.integraciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.integraciones.models.Alumno;
import pe.isil.integraciones.repositories.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> findAll(){
        return alumnoRepository.findAll();
    }

    public Alumno find(Long id){return alumnoRepository.getOne(id);}
    public void create(Alumno alumno){alumnoRepository.save(alumno);}

}
