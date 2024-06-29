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
public class StudentToDivisionMapDto {
    private long id;

    private StudentDto studentDto;
    /*
    private int divisionId;*/

    private BatchDto batchDto;

    private int rollNo;

    private String academicYear;

    private Semester semester;
}
