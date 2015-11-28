package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.importmsw.dto.AuthenticationUserDto;
import com.vdzon.msw.importmsw.model.User;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationUserMapper {

    public AuthenticationUserDto toDto(final User model) {
        if (model == null) return null;
        AuthenticationUserDto dto = new AuthenticationUserDto();
        dto.setUsername(model.getUsername());
        dto.setUuid(""+model.getId());
//        dto.setPasswd(model.getPassword());
        dto.setPasswd("q");
        dto.setPermissions("USER");
        return dto;
    }

}
