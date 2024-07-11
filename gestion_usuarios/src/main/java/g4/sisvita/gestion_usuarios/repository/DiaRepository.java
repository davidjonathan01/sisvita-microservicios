package g4.sisvita.gestion_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g4.sisvita.gestion_usuarios.model.Dia;

@Repository
public interface DiaRepository extends JpaRepository<Dia, Integer>{
    
}
