package com.vdzon.msw.emailservice.initialisation;

import org.springframework.stereotype.Service;

@Service
public class InitialisationService {

    private boolean initialized = false;

    public boolean isInitialized(){
        return initialized;
    }

    public void initialize() {
        System.out.println(".....Email service initialization finished");
        initialized = true;
    }



}
