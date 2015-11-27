package com.vdzon.msw.servicelayer.initialisation;

import com.vdzon.msw.servicelayer.repository.UserRepository;
import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ResourceBundle;

@Service
public class InitialisationService {
    @Inject
    UserRepository userRepository;

    private boolean initialized = false;

    public boolean isInitialized(){
        return initialized;
    }

    public void initialize() {
        System.out.println("Start migrate");
        ResourceBundle applicationProperties = ResourceBundle.getBundle("application");
        Flyway flyway = new Flyway();
        flyway.setDataSource(applicationProperties.getString("spring.datasource.url"), applicationProperties.getString("spring.datasource.username"), applicationProperties.getString("spring.datasource.password"));
        flyway.migrate();
        System.out.println("Finished with migration");
        System.out.println("Find user to test jpa.");
        System.out.println("User found: " + userRepository.findByUsername("q"));
        initialized = true;
    }



}
