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

import g4.sisvita.gestion_usuarios.model.Paciente;
import g4.sisvita.gestion_usuarios.service.PacienteService;

@RestController
@RequestMapping("api/v1/gestion_usuarios/paciente")
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePaciente(@RequestBody Paciente paciente) {
        pacienteService.savePaciente(paciente);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Paciente>> getAllPacientes() {
        return ResponseEntity.ok(pacienteService.getPacientes());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable int id) {
        Paciente paciente = pacienteService.getPacienteById(id);
        return paciente != null ? ResponseEntity.ok(paciente) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePaciente(@PathVariable int id) {
        pacienteService.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }
    
}
