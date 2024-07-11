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

import g4.sisvita.gestion_usuarios.model.Jornada;
import g4.sisvita.gestion_usuarios.service.JornadaService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/jornada")
public class JornadaController {

    @Autowired
    private JornadaService jornadaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveJornada(@RequestBody Jornada jornada) {
        jornadaService.saveJornada(jornada);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Jornada>> getAllJornadas() {
        return ResponseEntity.ok(jornadaService.getJornadas());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Jornada> getJornadaById(@PathVariable int id) {
        Jornada jornada = jornadaService.getJornadaById(id);
        return jornada != null ? ResponseEntity.ok(jornada) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteJornada(@PathVariable int id) {
        jornadaService.deleteJornada(id);
        return ResponseEntity.noContent().build();
    }
}
