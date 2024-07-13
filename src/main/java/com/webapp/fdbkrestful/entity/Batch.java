package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Semester;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;


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
}
