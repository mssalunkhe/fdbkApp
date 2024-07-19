package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
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

    @ManyToMany
    @JoinTable(name = "courseset_courses",
            joinColumns = @JoinColumn(name = "courseset_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
        private Set<Course> courses;
    private Status status;
    private String description;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
    @Column
    private LocalDateTime deletedOn;
}
