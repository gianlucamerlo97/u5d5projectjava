package gianlucamerlo.u5d5projectjava.services;

import gianlucamerlo.u5d5projectjava.entities.Edificio;
import gianlucamerlo.u5d5projectjava.exceptions.NotFoundException;
import gianlucamerlo.u5d5projectjava.exceptions.ValidationException;
import gianlucamerlo.u5d5projectjava.repositories.EdificiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EdificiService {
    @Autowired
    private EdificiRepository edificiRepository;

    public void saveEdificio(Edificio newEdificio) {



        // 2. Effettuo ulteriori controlli di validazione dei campi forniti
        if (newEdificio.getNome().length() < 2) throw new ValidationException("Il nome non può essere più corto di 2 caratteri!");
        //....


        // 4. Salvo l'edificio tramite Repository
        edificiRepository.save(newEdificio);

        // 5. Log di avvenuto salvataggio
        log.info("L'edificio " + newEdificio.getNome() + " è stato salvato correttamente!");
    }

    public List<Edificio> findAll() {
        return edificiRepository.findAll();
    }


    public Edificio findById(long edificioId) {

        return edificiRepository.findById(edificioId).orElseThrow(() -> new NotFoundException(edificioId)); // Alternativa più compatta al codice di sopra
    }

    public void findByIdAndUpdate(long edificioId, Edificio updatedEdificio) {
        // 1. Cerco l'edificio tramite id
        Edificio found = this.findById(edificioId);

        // 2. Aggiorno i campi di tale edificio
        found.setNome(updatedEdificio.getNome());
        found.setIndirizzo(updatedEdificio.getIndirizzo());
        found.setCitta(updatedEdificio.getCitta());


        // 3. Risalvo l'edificio modificato
        edificiRepository.save(found);

        // 4. Log di avvenuta modifica
        log.info("L'edificoo con id " + edificioId + " è stato modificato con successo!");
    }

    public void findByIdAndDelete(long edificioId) {
        Edificio found = this.findById(edificioId);
        edificiRepository.delete(found);
        log.info("L'edificio con id " + edificioId + " è stato cancellato correttamente!");
    }

    public void saveMany(List<Edificio> newEdifici) {
        for (Edificio edificio : newEdifici) {
            try {
                this.saveEdificio(edificio);
            } catch (ValidationException ex) {
                log.error(ex.getMessage());
            }
        }
    }
}

