package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Condicion;
import g4.sisvita.gestion_usuarios.repository.CondicionRepository;

@Service
public class CondicionService {
    
    @Autowired
    private CondicionRepository condicionRepository;

    public List<Condicion> getCondiciones(){
        return condicionRepository.findAll();
    }

    public Condicion saveCondicion(Condicion condicion){
        return condicionRepository.save(condicion);
    }

    public Condicion getCondicionById(int id){
        return condicionRepository.findById(id).orElse(null);
    }

    public void deleteCondicion(int id){
        condicionRepository.deleteById(id);
    }
}
