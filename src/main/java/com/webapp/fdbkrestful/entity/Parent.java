package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.Relationship;
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
//@Table(name = "parents")
public class Parent extends User {
    @Column(unique = true)
    private String PRNOfWard;
    @Column
    private Relationship relationWithWard;
}
