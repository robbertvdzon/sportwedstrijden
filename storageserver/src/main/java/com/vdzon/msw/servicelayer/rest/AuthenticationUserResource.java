package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.dto.AuthenticationUserDto;
import com.vdzon.msw.servicelayer.mapper.AuthenticationUserMapper;
import com.vdzon.msw.servicelayer.model.User;
import com.vdzon.msw.servicelayer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        List<User> users = new ArrayList<>();
        Iterable<User> all = userService.findAll();


        for (Iterator<User> iterator = all.iterator();iterator.hasNext(); ){
            User user = iterator.next();
            if (user.getUsername().equals("robbert")){
                System.out.println("Robbert "+user.getUuid());
            }
            users.add(user);
        }

        System.out.println(users.size());

        User user = userService.findByUsername(username);
        if (user==null){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<AuthenticationUserDto>(authenticationUserMapper.toDto(user), HttpStatus.OK);
    }

}
