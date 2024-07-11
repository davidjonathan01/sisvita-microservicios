package g4.sisvita.gestion_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g4.sisvita.gestion_usuarios.model.Condicion;

@Repository
public interface CondicionRepository extends JpaRepository<Condicion, Integer>{
    
}
