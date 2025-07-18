package gianlucamerlo.u5d5project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.net.Proxy;
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
@Table(name="edifici")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private String indirizzo;
    private String citta;

    public Edificio(String nome,String indirizzo,String citta)
    {
        this.nome=nome;
        this.indirizzo=indirizzo;
        this.citta=citta;
    }
}
