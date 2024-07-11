package dsw.ms.carrera.controller;

import dsw.ms.carrera.model.Carrera;
import dsw.ms.carrera.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carreras")
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
