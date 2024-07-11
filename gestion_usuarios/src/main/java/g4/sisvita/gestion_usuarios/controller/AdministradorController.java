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

import g4.sisvita.gestion_usuarios.model.Administrador;
import g4.sisvita.gestion_usuarios.service.AdministradorService;

@RestController
@RequestMapping("/api/v1/gestion_usuarios/administradores")
public class AdministradorController {
    
    @Autowired
    private AdministradorService administradorService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdministrador(@RequestBody Administrador administrador) {
        administradorService.saveAdministrador(administrador);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Administrador>> getAllAdministradores() {
        return ResponseEntity.ok(administradorService.getAdministradores());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Administrador> getAdministradorById(@PathVariable int id) {
        Administrador administrador = administradorService.getAdministradorById(id);
        return administrador != null ? ResponseEntity.ok(administrador) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAdministrador(@PathVariable int id) {
        administradorService.deleteAdministrador(id);
        return ResponseEntity.noContent().build();
    }
}
