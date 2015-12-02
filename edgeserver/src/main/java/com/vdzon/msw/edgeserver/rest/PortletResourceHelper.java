package com.vdzon.msw.edgeserver.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class PortletResourceHelper {

    @Value("${storage.server.host}")
    private String storageServerHost;

    @Value("${storage.server.port}")
    private String storageServerPort;


    RestTemplate restTemplate = new RestTemplate();

    public void proxyDeleteObject(UriComponentsBuilder uriComponentsBuilder) {
        restTemplate.delete(uriComponentsBuilder.build().toUri());
    }

    public <Entity> ResponseEntity<Entity> proxyPostModel(UriComponentsBuilder uriComponentsBuilder, Entity entity, Class entityClass) {
        ResponseEntity<Entity> response = restTemplate.postForEntity(uriComponentsBuilder.build().toUri(), entity, entityClass);
        if (response.getStatusCode() != HttpStatus.OK) {
            return new ResponseEntity(response.getStatusCode());
        }
        return new ResponseEntity<Entity>(response.getBody(), HttpStatus.OK);
    }

    public <Entity> ResponseEntity<Entity> proxyGetEntity(UriComponentsBuilder uriComponentsBuilder, Class entityClass) {
        System.out.println(uriComponentsBuilder.toUriString());
        ResponseEntity<Entity> response = restTemplate.getForEntity(uriComponentsBuilder.build().toUri(), entityClass);
        if (response.getStatusCode() != HttpStatus.OK) {
            return new ResponseEntity<Entity>(response.getStatusCode());
        }
        return new ResponseEntity<Entity>(response.getBody(), HttpStatus.OK);
    }

    public UriComponentsBuilder getUri(String service) {
        return getUri(service, "");
    }

    public UriComponentsBuilder getUriWithId(String service, String id) {
        return UriComponentsBuilder.fromUriString("http://"+storageServerHost+":"+storageServerPort)
                .path("/api/" + service + "/" + id);
    }

    public UriComponentsBuilder getUri(String service, String call) {
        return UriComponentsBuilder.fromUriString("http://"+storageServerHost+":"+storageServerPort)
                .path("/api/" + service + "/" + call);
    }
}