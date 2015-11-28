package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.importmsw.dto.TeammemberDto;
import com.vdzon.msw.importmsw.model.Teammember;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeammemberMapper {

    public TeammemberDto toDto(final Teammember model) {
        if (model == null) return null;
        TeammemberDto dto = new TeammemberDto();
        dto.setNickname(model.getNickname());
        dto.setUuid(""+model.getId());
        dto.setTeamUuid(""+model.getTeam().getId());
        dto.setUserUuid((""+model.getUserID()));
        return dto;
    }

    public List<TeammemberDto> toDto(List<Teammember> models) {
        List<TeammemberDto> userModels = new ArrayList<TeammemberDto>();
        if (models != null) {
            for (Teammember model : models) {
                userModels.add(toDto(model));
            }
        }
        return userModels;
    }

}
