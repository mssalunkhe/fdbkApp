package com.webapp.fdbkrestful.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "divcourseset_to_faculty_map")
public abstract class DivCourseSetToFacultyMap {
    @Id
    int divToCourseSetMapID;
    Map<CourseWithBatch, List<Staff>> courseToFacultyMap;
    private int divisionId;
    private int courseSetId;
}
