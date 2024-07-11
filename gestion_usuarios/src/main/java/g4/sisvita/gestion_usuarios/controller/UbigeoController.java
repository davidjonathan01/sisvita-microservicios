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

import g4.sisvita.gestion_usuarios.model.Ubigeo;
import g4.sisvita.gestion_usuarios.service.UbigeoService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/ubigeo")
public class UbigeoController {
    
    @Autowired
    private UbigeoService ubigeoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUbigeo(@RequestBody Ubigeo ubigeo) {
        ubigeoService.saveUbigeo(ubigeo);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Ubigeo>> getAllUbigeos() {
        return ResponseEntity.ok(ubigeoService.getUbigeos());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Ubigeo> getUbigeoById(@PathVariable int id) {
        Ubigeo ubigeo = ubigeoService.getUbigeoById(id);
        return ubigeo != null ? ResponseEntity.ok(ubigeo) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUbigeo(@PathVariable int id) {
        ubigeoService.deleteUbigeo(id);
        return ResponseEntity.noContent().build();
    }
}
