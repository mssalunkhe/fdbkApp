package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.entity.StudentToBatchMapCompositeKey;
import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentToBatchMapDto {

    StudentToBatchMapCompositeKey key;
    private int rollNo;
}
