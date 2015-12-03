package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.shared.dto.TeamDto;
import com.vdzon.msw.shared.dto.UserDto;
import com.vdzon.msw.servicelayer.model.Teammember;
import com.vdzon.msw.servicelayer.model.User;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

    @Inject
    TeamMapper teamMapper;

    public User mergeModel(final UserDto dto, User model) {
        model.setUsername(dto.getUsername());
        model.setUuid(dto.getUuid());
        model.setEmail(dto.getEmail());
        model.setName(dto.getName());
        model.setActiveAccount(dto.isActiveAccount());
        model.setActivationID(dto.getActivationID());
        model.setCreationDate(dto.getCreationDate());
        model.setPhonenumber(dto.getPhonenumber());
        model.setRequestConnectTeam(dto.getRequestConnectTeam());
        model.setProUser(dto.isProUser());
        return model;
    }

    public UserDto toDto(final User model) {
        if (model == null) return null;
        UserDto dto = new UserDto();
        dto.setUsername(model.getUsername());
        dto.setUuid(model.getUuid());
        dto.setEmail(model.getEmail());
        dto.setName(model.getName());
        dto.setActiveAccount(model.isActiveAccount());
        dto.setActivationID(model.getActivationID());
        dto.setCreationDate(model.getCreationDate());
        dto.setPhonenumber(model.getPhonenumber());
        dto.setRequestConnectTeam(model.getRequestConnectTeam());
        dto.setProUser(model.isProUser());

        // copy the teams directly, skip the teammembers
        List<TeamDto> teams = new ArrayList<TeamDto>();
        if (model.getTeammembers()!=null){
            for (Teammember teammember : model.getTeammembers()){
                if (teammember.getTeam()!=null){
                    teams.add(teamMapper.toDto(teammember.getTeam()));
                }
            }
        }
        dto.setTeams(teams);
        return dto;
    }

    public List<UserDto> toDto(List<User> models) {
        List<UserDto> userModels = new ArrayList<UserDto>();
        if (models != null) {
            for (User model : models) {
                userModels.add(toDto(model));
            }
        }
        return userModels;
    }
}
