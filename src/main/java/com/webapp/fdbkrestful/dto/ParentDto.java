package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor
public class ParentDto extends UserDto {

    private Set<Student> wards;
}
