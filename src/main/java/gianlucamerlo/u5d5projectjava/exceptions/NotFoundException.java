package gianlucamerlo.u5d5projectjava.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long Id) {
        super("La risorsa con id " + Id + " non è stata trovata");
    }
}
