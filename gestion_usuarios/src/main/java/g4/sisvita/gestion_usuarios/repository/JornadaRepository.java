package g4.sisvita.gestion_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g4.sisvita.gestion_usuarios.model.Jornada;

@Repository
public interface JornadaRepository extends JpaRepository<Jornada, Integer>{
    
}
