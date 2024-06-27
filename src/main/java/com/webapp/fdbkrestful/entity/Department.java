package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id", referencedColumnName = "id")
    private Set<SchoolClass> classes;
    private Status status;
    @Column
    private String description;
}
