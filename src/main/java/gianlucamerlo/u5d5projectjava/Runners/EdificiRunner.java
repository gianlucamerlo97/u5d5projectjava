package gianlucamerlo.u5d5projectjava.Runners;

import gianlucamerlo.u5d5projectjava.services.EdificiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class EdificiRunner  implements CommandLineRunner {
    @Autowired
    private EdificiService edificiService;

    @Override
    public void run(String... args) throws Exception {
        EdificiService.findAll().forEach(System.out::println);
    }
}
