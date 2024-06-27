package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.CourseType;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String code;
    @Column
    private String abbreviation;
    @Column
    private String name;
    @Column
    private CourseType type;
    @Column
    private Status status;
    @Column
    private String description;

}
