package com.vdzon.msw.portlet.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestMapping("/ping")
@RestController
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

    @GET
    @RequestMapping("/")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

}
