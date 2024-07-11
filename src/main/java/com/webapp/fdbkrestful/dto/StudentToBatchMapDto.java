package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentToBatchMapDto {
    private StudentDto studentDto;
    private BatchDto batchDto;
    private String academicYear;
    private Semester semester;

    private int rollNo;


}
