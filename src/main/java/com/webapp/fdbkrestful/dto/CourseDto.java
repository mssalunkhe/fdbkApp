package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.CourseType;
import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private int id;
    private String code;

    private String abbreviation;

    private String name;

    private CourseType type;
    private Status status;

    private String description;
    /*private CourseSet courseSet;*/
}
