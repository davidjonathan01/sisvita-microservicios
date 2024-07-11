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

import g4.sisvita.gestion_usuarios.model.Genero;
import g4.sisvita.gestion_usuarios.service.GeneroService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/genero")
public class GeneroController {
    
    @Autowired
    private GeneroService generoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveGenero(@RequestBody Genero genero) {
        generoService.saveGenero(genero);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Genero>> getAllGeneros() {
        return ResponseEntity.ok(generoService.getGeneros());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Genero> getGeneroById(@PathVariable int id) {
        Genero genero = generoService.getGeneroById(id);
        return genero != null ? ResponseEntity.ok(genero) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGenero(@PathVariable int id) {
        generoService.deleteGenero(id);
        return ResponseEntity.noContent().build();
    }
}
