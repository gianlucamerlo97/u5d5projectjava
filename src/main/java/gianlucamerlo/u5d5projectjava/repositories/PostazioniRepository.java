package gianlucamerlo.u5d5projectjava.repositories;

import gianlucamerlo.u5d5projectjava.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazione,Long> {

}
