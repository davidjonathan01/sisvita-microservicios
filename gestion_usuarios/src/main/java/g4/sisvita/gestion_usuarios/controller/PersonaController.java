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

import g4.sisvita.gestion_usuarios.model.Persona;
import g4.sisvita.gestion_usuarios.service.PersonaService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/persona")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePersona(@RequestBody Persona persona) {
        personaService.savePersona(persona);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaService.getPersonas());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable int id) {
        Persona persona = personaService.getPersonaById(id);
        return persona != null ? ResponseEntity.ok(persona) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable int id) {
        personaService.deletePersona(id);
        return ResponseEntity.noContent().build();
    }
    
}
