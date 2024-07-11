package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.Administrador;
import g4.sisvita.gestion_usuarios.repository.AdministradorRepository;

@Service
public class AdministradorService {
    
    @Autowired
    private AdministradorRepository administradorRepository;

    public List<Administrador> getAdministradores() {
        return administradorRepository.findAll();
    }

    public Administrador saveAdministrador(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public Administrador getAdministradorById(int id) {
        return administradorRepository.findById(id).orElse(null);
    }

    public void deleteAdministrador(int id) {
        administradorRepository.deleteById(id);
    }
}
