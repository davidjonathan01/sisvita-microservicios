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

import g4.sisvita.gestion_usuarios.model.Especialista;
import g4.sisvita.gestion_usuarios.service.EspecialistaService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/especialista")
public class EspecialistaController {
    
    @Autowired
    private EspecialistaService especialistaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEspecialista(@RequestBody Especialista especialista) {
        especialistaService.saveEspecialista(especialista);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Especialista>> getAllEspecialistas() {
        return ResponseEntity.ok(especialistaService.getEspecialistas());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Especialista> getEspecialistaById(@PathVariable int id) {
        Especialista especialista = especialistaService.getEspecialistaById(id);
        return especialista != null ? ResponseEntity.ok(especialista) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEspecialista(@PathVariable int id) {
        especialistaService.deleteEspecialista(id);
        return ResponseEntity.noContent().build();
    }
}
