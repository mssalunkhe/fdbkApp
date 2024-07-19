package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Semester;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "batches")
@Data
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;
    @Column
    Status status;
    @Column
    String description;
    @Column
    String academicYear;
    @Column
    Semester semester;
    @ManyToOne
    @JoinColumn(name = "div_id")
    private Division division;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseset_id", referencedColumnName = "id")
    Courseset courseset;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_staff_mapping",
            joinColumns = {@JoinColumn(name = "batch_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "staff_id", referencedColumnName = "userid")})
            @MapKeyJoinColumn(name = "course_id")
    Map<Course,Staff> courseInstructors;
    @ManyToMany
    @JoinTable(name = "batch_students",
            joinColumns = @JoinColumn(name = "batch_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> students;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
    @Column
    private LocalDateTime deletedOn;

}




