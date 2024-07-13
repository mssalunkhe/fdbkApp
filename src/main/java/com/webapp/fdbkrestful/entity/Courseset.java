package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coursesets")
@Data
public class Courseset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    private String name;
    /*@Column
    private String academicYear;
    @Column
    private Semester semester;*/

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Set<Course> courses;
    private Status status;
    private String description;
}
