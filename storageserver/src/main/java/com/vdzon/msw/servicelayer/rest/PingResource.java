package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.initialisation.InitialisationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestMapping("/ping")
@RestController
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

    @Inject
    InitialisationService initialisationService;

    @GET
    @RequestMapping("/")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<String>(getInitializedStatus(), HttpStatus.OK);
    }

    private String getInitializedStatus(){
        return initialisationService.isInitialized() ? "OK" : "INITIALIZING";

    }

}
