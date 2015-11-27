package com.vdzon.msw.eventservice.initialisation;

import org.springframework.stereotype.Service;

@Service
public class InitialisationService {

    private boolean initialized = false;

    public boolean isInitialized(){
        return initialized;
    }

    public void initialize() {
        System.out.println(".....Event service initialization finished");
        initialized = true;
    }



}
