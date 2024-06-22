package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.Semester;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseSetDto {
    int id;

    private String name;

    private String academicYear;

    private Semester semester;

    private String courses;
}
