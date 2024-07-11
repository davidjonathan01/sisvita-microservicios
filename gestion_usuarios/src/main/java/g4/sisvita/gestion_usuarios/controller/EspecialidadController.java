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

import g4.sisvita.gestion_usuarios.model.Especialidad;
import g4.sisvita.gestion_usuarios.service.EspecialidadService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEspecialidad(@RequestBody Especialidad especialidad) {
        especialidadService.saveEspecialidad(especialidad);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Especialidad>> getAllEspecialidades() {
        return ResponseEntity.ok(especialidadService.getEspecialidades());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Especialidad> getEspecialidadById(@PathVariable int id) {
        Especialidad especialidad = especialidadService.getEspecialidadById(id);
        return especialidad != null ? ResponseEntity.ok(especialidad) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEspecialidad(@PathVariable int id) {
        especialidadService.deleteEspecialidad(id);
        return ResponseEntity.noContent().build();
    }
}
