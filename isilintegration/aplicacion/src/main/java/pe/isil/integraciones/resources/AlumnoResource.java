package pe.isil.integraciones.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.integraciones.services.AlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoResource {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumno")
    public ResponseEntity index(){
        return new ResponseEntity<>(alumnoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity show(@PathVariable("id")Long id){
        return new ResponseEntity<>(alumnoService.find(id), HttpStatus.OK);
    }
}
