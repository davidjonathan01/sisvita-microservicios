package g4.sisvita.gestion_usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g4.sisvita.gestion_usuarios.model.TipoUsuario;
import g4.sisvita.gestion_usuarios.repository.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {
    
    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public List<TipoUsuario> getTipoUsuarios(){
        return tipoUsuarioRepository.findAll();
    }

    public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario){
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public TipoUsuario getTipoUsuarioById(int id){
        return tipoUsuarioRepository.findById(id).orElse(null);
    }

    public void deleteTipoUsuario(int id){
        tipoUsuarioRepository.deleteById(id);
    }
}
