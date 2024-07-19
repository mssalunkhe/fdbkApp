package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Courseset;
import com.webapp.fdbkrestful.utility.Semester;
import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BatchDto {
    int id;

    String name;

    Status status;

    String description;

    String academicYear;

    Semester semester;
    private DivisionDto divisionDto;
    CoursesetDto coursesetDto;

    Map<CourseDto, StaffDto> courseInstructorsDto;

    Set<StudentDto> studentsDto;
    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private LocalDateTime deletedOn;

}
