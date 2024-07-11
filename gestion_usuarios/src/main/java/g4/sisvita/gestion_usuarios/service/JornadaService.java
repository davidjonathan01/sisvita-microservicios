package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Jornada;
import g4.sisvita.gestion_usuarios.repository.JornadaRepository;

@Service
public class JornadaService {
    
    @Autowired
    private JornadaRepository jornadaRepository;

    public List<Jornada> getJornadas(){
        return jornadaRepository.findAll();
    }

    public Jornada saveJornada(Jornada jornada){
        return jornadaRepository.save(jornada);
    }

    public Jornada getJornadaById(int id){
        return jornadaRepository.findById(id).orElse(null);
    }

    public void deleteJornada(int id){
        jornadaRepository.deleteById(id);
    }
}
