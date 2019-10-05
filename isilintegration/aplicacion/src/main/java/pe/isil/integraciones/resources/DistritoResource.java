package pe.isil.integraciones.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.integraciones.services.DistritoService;

@RestController
@RequestMapping("/api")
public class DistritoResource {

    @Autowired
    DistritoService distritoService;

    @GetMapping("/distrito")
    public ResponseEntity index(){
        return new ResponseEntity<>(distritoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/distrito/{id}")
    public ResponseEntity show(@PathVariable("id")int id){
        return new ResponseEntity<>(distritoService.find(id), HttpStatus.OK);
    }
}
