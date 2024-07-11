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

import g4.sisvita.gestion_usuarios.model.Condicion;
import g4.sisvita.gestion_usuarios.service.CondicionService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/condicion")
public class CondicionController {
    
    @Autowired
    private CondicionService condicionService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCondicion(@RequestBody Condicion condicion) {
        condicionService.saveCondicion(condicion);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Condicion>> getAllCondiciones() {
        return ResponseEntity.ok(condicionService.getCondiciones());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Condicion> getCondicionById(@PathVariable int id) {
        Condicion condicion = condicionService.getCondicionById(id);
        return condicion != null ? ResponseEntity.ok(condicion) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCondicion(@PathVariable int id) {
        condicionService.deleteCondicion(id);
        return ResponseEntity.noContent().build();
    }
}
