package com.vdzon.msw.servicelayer.initialisation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class BootRunner implements CommandLineRunner {

    @Inject
    InitialisationService initialisationService;

    @Override
    public void run(String... args) throws Exception {
        initialisationService.initialize();
    }
}