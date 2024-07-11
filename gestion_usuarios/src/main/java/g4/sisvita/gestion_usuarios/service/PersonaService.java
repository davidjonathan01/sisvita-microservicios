package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Persona;
import g4.sisvita.gestion_usuarios.repository.PersonaRepository;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona getPersonaById(int id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void deletePersona(int id) {
        personaRepository.deleteById(id);
    }
}
