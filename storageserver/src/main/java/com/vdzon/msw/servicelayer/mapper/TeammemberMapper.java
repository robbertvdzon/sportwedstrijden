package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.TeammemberDto;
import com.vdzon.msw.servicelayer.model.Teammember;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Component
public class TeammemberMapper {

    public Teammember mergeModel(final TeammemberDto dto, Teammember model) {
        model.setNickname(dto.getNickname());
        model.setUuid(dto.getUuid());
        model.setAdmin(dto.getAdmin());
        model.setDeleted(dto.isDeleted());
        model.setSupporter(dto.isSupporter());
        model.setInvitationEmail(dto.getInvitationEmail());
        model.setInvitationDate(dto.getInvitationDate());
        model.setInvitationID(dto.getInvitationID());
        model.setAcceptEmail(dto.getAcceptEmail());
        model.setInvaller(dto.isInvaller());
        return model;
    }

    public TeammemberDto toDto(final Teammember model) {
        if (model == null) return null;
        TeammemberDto dto = new TeammemberDto();
        dto.setNickname(model.getNickname());
        dto.setUuid(model.getUuid());
        dto.setTeamUuid(""+model.getTeam().getId());
        dto.setUserUuid(model.getUser().getUuid());
        dto.setAdmin(model.getAdmin());
        dto.setDeleted(model.getDeleted());
        dto.setSupporter(model.getSupporter());
        dto.setInvitationEmail(model.getInvitationEmail());
        dto.setInvitationDate(model.getInvitationDate());
        dto.setInvitationID(model.getInvitationID());
        dto.setAcceptEmail(model.getAcceptEmail());
        dto.setInvaller(model.getInvaller());
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
