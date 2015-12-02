package com.vdzon.msw.edgeserver.rest;

import com.vdzon.msw.edgeserver.dto.TeammemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@PreAuthorize("hasAuthority('USER')")
@RequestMapping("/rest/teamsmember")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PortletTeammembersResource {

    public static final String SERVICE = "teammembers";
    @Inject
    PortletResourceHelper portletResourceHelper;

    @GET
    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<TeammemberDto> get(@PathVariable("uuid") String uuid) {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUriWithId(SERVICE, uuid);
        return portletResourceHelper.<TeammemberDto>proxyGetEntity(uriBuilder, TeammemberDto.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity save(TeammemberDto teammemberDto) throws Exception {
        ResponseEntity<TeammemberDto> response = portletResourceHelper.<TeammemberDto>proxyGetEntity(portletResourceHelper.getUriWithId(SERVICE,teammemberDto.getUuid()), TeammemberDto.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            return new ResponseEntity(response.getStatusCode());
        }
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUri(SERVICE);
        portletResourceHelper.<TeammemberDto>proxyPostModel(uriBuilder, teammemberDto, TeammemberDto.class);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity add(TeammemberDto teammemberDto) throws Exception {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUri(SERVICE);
        portletResourceHelper.<TeammemberDto>proxyPostModel(uriBuilder, teammemberDto, TeammemberDto.class);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/{uuid}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable("uuid") String uuid) throws Exception {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUriWithId(SERVICE, uuid);
        portletResourceHelper.proxyDeleteObject(uriBuilder);
        return new ResponseEntity(HttpStatus.OK);
    }
}
