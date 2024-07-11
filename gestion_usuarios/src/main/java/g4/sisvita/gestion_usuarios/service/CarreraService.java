package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import g4.sisvita.gestion_usuarios.model.Carrera;
import g4.sisvita.gestion_usuarios.repository.CarreraRepository;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> getCarreras() {
        return carreraRepository.findAll();
    }

    public Carrera saveCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public Carrera getCarreraById(int id) {
        return carreraRepository.findById(id).orElse(null);
    }

    public void deleteCarrera(int id) {
        carreraRepository.deleteById(id);
    }
    
}
