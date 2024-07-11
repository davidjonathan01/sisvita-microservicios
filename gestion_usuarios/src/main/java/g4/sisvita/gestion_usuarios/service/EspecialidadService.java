package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Especialidad;
import g4.sisvita.gestion_usuarios.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
    
    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> getEspecialidades(){
        return especialidadRepository.findAll();
    }

    public Especialidad saveEspecialidad(Especialidad especialidad){
        return especialidadRepository.save(especialidad);
    }

    public Especialidad getEspecialidadById(int id){
        return especialidadRepository.findById(id).orElse(null);
    }

    public void deleteEspecialidad(int id){
        especialidadRepository.deleteById(id);
    }
}
