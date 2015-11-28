package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.dto.UserDto;
import com.vdzon.msw.servicelayer.mapper.UserMapper;
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
@RequestMapping("/api/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    @Inject
    UserRepository userService;

    @Inject
    UserMapper userMapper;

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUser(@PathVariable("uuid") String uuid) {
        User user = userService.findByUuid(uuid);
        if (user == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDto>(userMapper.toDto(user), HttpStatus.OK);
    }

    @RequestMapping(value = "/findByUsername", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getContacts(String username) throws Exception {
        User user = userService.findByUsername(username);
        if (user == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDto>(userMapper.toDto(user), HttpStatus.OK);
    }


}
