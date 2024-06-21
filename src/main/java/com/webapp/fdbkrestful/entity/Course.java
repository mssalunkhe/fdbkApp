package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.CourseType;
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
@Table(name = "course")
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
    private String description;


}
