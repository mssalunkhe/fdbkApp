package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "div_to_courseset_map")
public abstract class DivisionToCourseSetMap {
    @Id
    private int id;
    @Column
    private String academicYear;
    @Column
    private Semester semester;
    @Column
    private int divisionId;
    @Column
    private int courseSetId;
}
