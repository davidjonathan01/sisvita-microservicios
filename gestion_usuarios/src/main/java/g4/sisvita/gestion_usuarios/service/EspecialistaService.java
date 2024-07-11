package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Especialista;
import g4.sisvita.gestion_usuarios.repository.EspecialistaRepository;

@Service
public class EspecialistaService {
    
    @Autowired
    private EspecialistaRepository especialistaRepository;

    public List<Especialista> getEspecialistas(){
        return especialistaRepository.findAll();
    }

    public Especialista saveEspecialista(Especialista especialista){
        return especialistaRepository.save(especialista);
    }

    public Especialista getEspecialistaById(int id){
        return especialistaRepository.findById(id).orElse(null);
    }

    public void deleteEspecialista(int id){
        especialistaRepository.deleteById(id);
    }
}
