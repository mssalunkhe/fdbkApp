package com.webapp.fdbkrestful.entity;


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
@Table(name = "student_to_batch_map")
public class StudentToBatchMap {

    /*@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "stud_id", referencedColumnName = "userID")
    private Student student;
    *//*@Column
    private int divisionId;*//*
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "batch_id", referencedColumnName = "id")
    private Batch batch;*/
    @EmbeddedId
    StudentToBatchMapCompositeKey studentToBatchMapCompositeKey;

    @Column
    private int rollNo;


}
