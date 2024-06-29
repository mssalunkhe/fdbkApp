package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.EmployerDto;
import com.webapp.fdbkrestful.entity.Employer;

public class EmployerMapper extends UserMapper {
    public static EmployerDto mapToEmployerDto(Employer employer) {
        return EmployerDto.builder().userID(employer.getUserID())
                .name(employer.getName())
                .email(employer.getEmail())
                .address(employer.getAddress())
                .mobile(employer.getMobile())
                .dateOfBirth(employer.getDateOfBirth())
                .company(employer.getCompany())
                .designation(employer.getDesignation())
                .build();
        // return new EmployerDto(  employer.getType(),employer.getInstitute());//,employer.getEmail(),employer.getAddress(),employer.getDateOfBirth(),employer.getMobile());


    }

    public static Employer mapToEmployer(EmployerDto employerDto) {
        return Employer.builder().userID(employerDto.getUserID())
                .name(employerDto.getName())
                .email(employerDto.getEmail())
                .address(employerDto.getAddress())
                .mobile(employerDto.getMobile())
                .dateOfBirth(employerDto.getDateOfBirth())
                .company(employerDto.getCompany())
                .designation(employerDto.getDesignation())
                .build();
    }
}
