package g4.sisvita.gestion_usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import g4.sisvita.gestion_usuarios.model.Carrera;
import g4.sisvita.gestion_usuarios.service.CarreraService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/carrera")
public class CarreraController {
    
    @Autowired
    private CarreraService carreraService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCarrera(@RequestBody Carrera carrera) {
        carreraService.saveCarrera(carrera);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Carrera>> getAllCarreras() {
        return ResponseEntity.ok(carreraService.getCarreras());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Carrera> getCarreraById(@PathVariable int id) {
        Carrera carrera = carreraService.getCarreraById(id);
        return carrera != null ? ResponseEntity.ok(carrera) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCarrera(@PathVariable int id) {
        carreraService.deleteCarrera(id);
        return ResponseEntity.noContent().build();
    }
}
