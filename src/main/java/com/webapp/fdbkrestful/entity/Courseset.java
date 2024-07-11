package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
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

    @OneToMany(mappedBy = "courseset", cascade = CascadeType.ALL)
    private Set<Course> courses;
    private Status status;
    private String description;
}
