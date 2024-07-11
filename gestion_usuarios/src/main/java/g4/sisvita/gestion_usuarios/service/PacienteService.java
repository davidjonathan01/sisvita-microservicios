package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Paciente;
import g4.sisvita.gestion_usuarios.repository.PacienteRepository;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente savePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente getPacienteById(int id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    public void deletePaciente(int id) {
        pacienteRepository.deleteById(id);
    }
}
