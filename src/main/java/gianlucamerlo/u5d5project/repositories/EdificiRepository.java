package gianlucamerlo.u5d5project.repositories;

import gianlucamerlo.u5d5project.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Specializzazione di @Component, però dedicata al mondo dei DB
public interface EdificiRepository extends JpaRepository<Edificio, Long>{

}
