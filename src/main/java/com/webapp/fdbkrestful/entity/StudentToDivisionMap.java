package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_to_div_map")
public abstract class StudentToDivisionMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long studentId;
    /*@Column
    private int divisionId;*/
    @Column
    private int batchId;
    @Column
    private String academicYear;
    @Column
    private Semester semester;
}
