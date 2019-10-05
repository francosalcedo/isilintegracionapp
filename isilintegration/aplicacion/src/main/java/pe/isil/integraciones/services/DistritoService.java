package pe.isil.integraciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.integraciones.models.Distrito;
import pe.isil.integraciones.repositories.DistritoRepository;

import java.util.List;

@Service
public class DistritoService {
    @Autowired
    private DistritoRepository distritoRepository;

    public List<Distrito> findAll(){
        return distritoRepository.findAll();
    }

    public Distrito find(int idDistrito){return distritoRepository.getOne(idDistrito);}
    public void create(Distrito distrito){distritoRepository.save(distrito);}
}
