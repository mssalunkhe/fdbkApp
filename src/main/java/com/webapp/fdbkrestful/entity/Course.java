package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.CourseType;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
@Data
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
    @ManyToOne
    @JoinColumn(name = "courseset_id")
    private Courseset courseset;

}
