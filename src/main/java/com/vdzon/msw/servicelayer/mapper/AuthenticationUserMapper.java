package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.AuthenticationUserDto;
import com.vdzon.msw.servicelayer.dto.TeamDto;
import com.vdzon.msw.servicelayer.dto.UserDto;
import com.vdzon.msw.servicelayer.model.Teammember;
import com.vdzon.msw.servicelayer.model.User;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class AuthenticationUserMapper {

    public User mergeModel(final AuthenticationUserDto dto, User model) {
        model.setUsername(dto.getUsername());
        model.setUuid(dto.getUuid());
        model.setPasswd(dto.getPasswd());
        model.setPermissions(dto.getPermissions());
        return model;
    }

    public AuthenticationUserDto toDto(final User model) {
        if (model == null) return null;
        AuthenticationUserDto dto = new AuthenticationUserDto();
        dto.setUsername(model.getUsername());
        dto.setUuid(model.getUuid());
        dto.setPasswd(model.getPasswd());
        dto.setPermissions(model.getPermissions());
        return dto;
    }

}
