package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Ubigeo;
import g4.sisvita.gestion_usuarios.repository.UbigeoRepository;

@Service
public class UbigeoService {
    
    @Autowired
    private UbigeoRepository ubigeoRepository;

    public List<Ubigeo> getUbigeos(){
        return ubigeoRepository.findAll();
    }

    public Ubigeo saveUbigeo(Ubigeo ubigeo){
        return ubigeoRepository.save(ubigeo);
    }

    public Ubigeo getUbigeoById(int id){
        return ubigeoRepository.findById(id).orElse(null);
    }

    public void deleteUbigeo(int id){
        ubigeoRepository.deleteById(id);
    }
}
