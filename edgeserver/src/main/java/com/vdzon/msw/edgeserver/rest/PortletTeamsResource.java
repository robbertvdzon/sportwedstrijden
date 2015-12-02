package com.vdzon.msw.edgeserver.rest;

import com.vdzon.msw.edgeserver.dto.TeamDto;
import com.vdzon.msw.edgeserver.dto.TeammemberDto;
import com.vdzon.msw.edgeserver.services.AuthenticationService;
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
@RequestMapping("/rest/teams")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PortletTeamsResource {

    public static final String SERVICE = "teams";
    @Inject
    PortletResourceHelper portletResourceHelper;

    @Inject
    PortletTeammembersResource portletTeammembersResource;

    @Inject
    AuthenticationService authenticationService;

    @GET
    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<TeamDto> get(@PathVariable("uuid") String uuid) {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUriWithId(SERVICE, uuid);
        return portletResourceHelper.<TeamDto>proxyGetEntity(uriBuilder, TeamDto.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity save(TeamDto teamDto) throws Exception {
        ResponseEntity<TeamDto> response = portletResourceHelper.<TeamDto>proxyGetEntity(portletResourceHelper.getUriWithId(SERVICE, teamDto.getUuid()), TeamDto.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            return new ResponseEntity(response.getStatusCode());
        }
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUri(SERVICE);
        portletResourceHelper.<TeamDto>proxyPostModel(uriBuilder, teamDto, TeamDto.class);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity add(TeamDto teamDto) throws Exception {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUri(SERVICE);
        ResponseEntity<TeamDto> response = portletResourceHelper.<TeamDto>proxyPostModel(uriBuilder, teamDto, TeamDto.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            return new ResponseEntity(response.getStatusCode());
        }
        teamDto = response.getBody();
        TeammemberDto teammemberDto = new TeammemberDto();
        teammemberDto.setTeamUuid(teamDto.getUuid());
        teammemberDto.setUserUuid(authenticationService.getUserUuid());

        ResponseEntity<TeammemberDto> teammemberDtoResponseEntity = portletTeammembersResource.add(teammemberDto);
        return new ResponseEntity(teammemberDtoResponseEntity.getStatusCode());
    }

    @RequestMapping(value = "/{uuid}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable("uuid") String uuid) throws Exception {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUriWithId(SERVICE, uuid);
        portletResourceHelper.proxyDeleteObject(uriBuilder);
        return new ResponseEntity(HttpStatus.OK);
    }
}
