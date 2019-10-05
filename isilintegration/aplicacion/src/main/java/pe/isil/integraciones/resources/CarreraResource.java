package pe.isil.integraciones.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.integraciones.services.CarreraService;

@RestController
@RequestMapping("/api")
public class CarreraResource {

    @Autowired
    CarreraService carreraService;

    @GetMapping("/carrera")
    public ResponseEntity index(){
        return new ResponseEntity<>(carreraService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/carrera/{id}")
    public ResponseEntity show(@PathVariable("id")Long id){
        return new ResponseEntity<>(carreraService.find(id), HttpStatus.OK);
    }
}
