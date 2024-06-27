package com.webapp.fdbkrestful.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "students")
public class Student extends User {
    @Column(unique = true)
    private String PRN;
    @Column
    private int yearOfAdmission;
}
