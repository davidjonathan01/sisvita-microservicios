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

import g4.sisvita.gestion_usuarios.model.TipoUsuario;
import g4.sisvita.gestion_usuarios.service.TipoUsuarioService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/tipo_usuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TipoUsuario>> getAllTipoUsuarios() {
        return ResponseEntity.ok(tipoUsuarioService.getTipoUsuarios());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<TipoUsuario> getTipoUsuarioById(@PathVariable int id) {
        TipoUsuario tipoUsuario = tipoUsuarioService.getTipoUsuarioById(id);
        return tipoUsuario != null ? ResponseEntity.ok(tipoUsuario) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTipoUsuario(@PathVariable int id) {
        tipoUsuarioService.deleteTipoUsuario(id);
        return ResponseEntity.noContent().build();
    }
    
}
