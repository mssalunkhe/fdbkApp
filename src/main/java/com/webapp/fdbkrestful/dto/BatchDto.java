package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.Semester;
import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
