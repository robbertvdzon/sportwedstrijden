package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.TeammemberDto;
import com.vdzon.msw.servicelayer.model.Teammember;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeammemberMapper {

    public Teammember mergeModel(final TeammemberDto dto, Teammember model) {
        model.setNickname(dto.getNickname());
        return model;
    }

    public TeammemberDto toDto(final Teammember model) {
        if (model == null) return null;
        TeammemberDto dto = new TeammemberDto();
        dto.setNickname(model.getNickname());
        dto.setUuid(model.getUuid());
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
