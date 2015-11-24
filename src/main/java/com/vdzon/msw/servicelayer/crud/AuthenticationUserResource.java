package com.vdzon.msw.servicelayer.crud;

import com.vdzon.msw.servicelayer.dto.AuthenticationUserDto;
import com.vdzon.msw.servicelayer.mapper.AuthenticationUserMapper;
import com.vdzon.msw.servicelayer.model.User;
import com.vdzon.msw.servicelayer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/api/authentication")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationUserResource {

    @Inject
    UserRepository userService;

    @Inject
    AuthenticationUserMapper authenticationUserMapper;

    @RequestMapping(value = "/findByUsername", method = RequestMethod.GET)
    public ResponseEntity<AuthenticationUserDto> getContacts(String username) throws Exception {
        User user = userService.findByUsername(username);
        if (user==null){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<AuthenticationUserDto>(authenticationUserMapper.toDto(user), HttpStatus.OK);
    }

}
