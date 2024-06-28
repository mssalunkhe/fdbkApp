package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.VisitorDto;
import com.webapp.fdbkrestful.entity.Visitor;

public class VisitorMapper extends UserMapper {
    public static VisitorDto mapToVisitorDto(Visitor visitor) {
        return VisitorDto.builder().userID(visitor.getUserID())
                .name(visitor.getName())
                .email(visitor.getEmail())
                .address(visitor.getAddress())
                .mobile(visitor.getMobile())
                .dateOfBirth(visitor.getDateOfBirth())
                .type(visitor.getType())
                .institute(visitor.getInstitute())
                .build();
        // return new VisitorDto(  visitor.getType(),visitor.getInstitute());//,visitor.getEmail(),visitor.getAddress(),visitor.getDateOfBirth(),visitor.getMobile());


    }

    public static Visitor mapToVisitor(VisitorDto visitorDto) {
        return Visitor.builder().userID(visitorDto.getUserID())
                .name(visitorDto.getName())
                .email(visitorDto.getEmail())
                .address(visitorDto.getAddress())
                .mobile(visitorDto.getMobile())
                .dateOfBirth(visitorDto.getDateOfBirth())
                .type(visitorDto.getType())
                .institute(visitorDto.getInstitute())
                .build();
    }
}
