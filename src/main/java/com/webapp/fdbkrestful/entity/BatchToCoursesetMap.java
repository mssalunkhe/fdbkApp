package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public  class BatchToCoursesetMap {

    private int id;


    Batch batch;

    Courseset courseset;

    String academicYear;

    Semester semester;


}
