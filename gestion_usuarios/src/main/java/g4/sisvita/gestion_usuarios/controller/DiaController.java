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

import g4.sisvita.gestion_usuarios.model.Dia;
import g4.sisvita.gestion_usuarios.service.DiaService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/dia")
public class DiaController {
    
    @Autowired
    private DiaService diaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDia(@RequestBody Dia dia) {
        diaService.saveDia(dia);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dia>> getAllDias() {
        return ResponseEntity.ok(diaService.getDias());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Dia> getDiaById(@PathVariable int id) {
        Dia dia = diaService.getDiaById(id);
        return dia != null ? ResponseEntity.ok(dia) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDia(@PathVariable int id) {
        diaService.deleteDia(id);
        return ResponseEntity.noContent().build();
    }
}
