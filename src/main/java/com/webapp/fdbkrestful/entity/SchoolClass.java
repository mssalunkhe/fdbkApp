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
@Table(name = "classes")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    Set<Division> divisions;
    @Column
    private Status status;
    @Column
    String description;
}
