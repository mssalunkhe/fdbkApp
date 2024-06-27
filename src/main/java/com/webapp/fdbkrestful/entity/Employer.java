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
//@Table(name = "employers")
public class Employer extends User {
    @Column
    private String Company;
    @Column
    private String designation;

}
