package gianlucamerlo.u5d5project.services;

import gianlucamerlo.u5d5project.repositories.EdificiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificiService {
    @Autowired
    private EdificiRepository edificiRepository;
}
