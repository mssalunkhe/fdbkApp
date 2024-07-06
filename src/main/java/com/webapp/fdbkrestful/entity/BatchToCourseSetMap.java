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
@Table(name = "div_to_courseset_map")
public abstract class BatchToCourseSetMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String academicYear;
    @Column
    private Semester semester;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "batch_id", referencedColumnName = "id")
    private Batch batch;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseset_id", referencedColumnName = "id")
    private CourseSet courseSet;
}
