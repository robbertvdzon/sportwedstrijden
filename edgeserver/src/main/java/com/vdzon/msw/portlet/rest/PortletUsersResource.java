package com.vdzon.msw.portlet.rest;

import com.vdzon.msw.portlet.dto.UserDto;
import com.vdzon.msw.portlet.services.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestMapping("/users")
@RestController
@Produces(MediaType.APPLICATION_JSON)
public class PortletUsersResource {

    @Inject
    AuthenticationService authenticationService;

    @Inject
    PortletResourceHelper portletResourceHelper;

    @GET
    @RequestMapping("/getcurrentuser")
    public ResponseEntity<UserDto> get() {
        String uuid = authenticationService.getUserUuid();
        if (uuid == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUriWithId("users", uuid);
        return portletResourceHelper.<UserDto>proxyGetEntity(uriBuilder, UserDto.class);
    }

}
