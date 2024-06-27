package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coursesets")
public class CourseSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    private String name;
    /*@Column
    private String academicYear;
    @Column
    private Semester semester;*/

    @OneToMany
    private Set<Course> courses;
    private Status status;
    private String description;
}
