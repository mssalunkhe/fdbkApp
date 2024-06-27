package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseSetDto {
    int id;

    private String name;


    private Set<CourseDto> courses;
    private Status status;
    private String description;
}
