package gianlucamerlo.u5d5projectjava.repositories;

import gianlucamerlo.u5d5projectjava.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtentiRepository extends JpaRepository<Utente,Long> {
}
