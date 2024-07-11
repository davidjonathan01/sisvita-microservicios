package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Genero;
import g4.sisvita.gestion_usuarios.repository.GeneroRepository;

@Service
public class GeneroService {
    
    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> getGeneros() {
        return generoRepository.findAll();
    }

    public Genero saveGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero getGeneroById(int id) {
        return generoRepository.findById(id).orElse(null);
    }

    public void deleteGenero(int id) {
        generoRepository.deleteById(id);
    }
}
