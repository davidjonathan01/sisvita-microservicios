package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Dia;
import g4.sisvita.gestion_usuarios.repository.DiaRepository;

@Service
public class DiaService {
    
    @Autowired
    private DiaRepository diaRepository;

    public List<Dia> getDias(){
        return diaRepository.findAll();
    }

    public Dia saveDia(Dia dia){
        return diaRepository.save(dia);
    }

    public Dia getDiaById(int id){
        return diaRepository.findById(id).orElse(null);
    }

    public void deleteDia(int id){
        diaRepository.deleteById(id);
    }
}
