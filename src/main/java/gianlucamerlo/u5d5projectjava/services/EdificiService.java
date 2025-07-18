package gianlucamerlo.u5d5projectjava.services;

import gianlucamerlo.u5d5projectjava.repositories.EdificiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificiService {
    @Autowired
    private EdificiRepository edificiRepository;
}
