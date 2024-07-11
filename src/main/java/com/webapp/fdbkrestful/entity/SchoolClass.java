package com.webapp.fdbkrestful.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classes")
@Data
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.ALL)
    Set<Division> divisions;
    @Column
    private Status status;
    @Column
    String description;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
