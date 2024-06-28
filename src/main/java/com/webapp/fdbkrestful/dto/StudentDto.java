package com.webapp.fdbkrestful.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor
public class StudentDto extends UserDto {

    private String PRN;
    private int yearOfAdmission;
}
