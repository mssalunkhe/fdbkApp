package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.ParentDto;
import com.webapp.fdbkrestful.entity.Parent;

public class ParentMapper extends UserMapper {
    public static ParentDto mapToParentDto(Parent parent) {
        return ParentDto.builder().userID(parent.getUserID())
                .name(parent.getName())
                .email(parent.getEmail())
                .address(parent.getAddress())
                .mobile(parent.getMobile())
                .dateOfBirth(parent.getDateOfBirth())
                .wards(parent.getWards())
                .build();
        // return new ParentDto(  parent.getType(),parent.getInstitute());//,parent.getEmail(),parent.getAddress(),parent.getDateOfBirth(),parent.getMobile());


    }

    public static Parent mapToParent(ParentDto parentDto) {
        return Parent.builder().userID(parentDto.getUserID())
                .name(parentDto.getName())
                .email(parentDto.getEmail())
                .address(parentDto.getAddress())
                .mobile(parentDto.getMobile())
                .dateOfBirth(parentDto.getDateOfBirth())
                .wards(parentDto.getWards())
                .build();
    }
}
