package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorValue("student")
public class Student extends User {
    @Column(unique = true)
    private String PRN;
    @Column
    private int yearOfAdmission;
    @OneToMany(targetEntity = Batch.class)
    Set<Batch> batches;

}
