package com.webapp.fdbkrestful.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)

    private Set<SchoolClass> classes;
    private Status status;
    @Column
    private String description;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
    @Column
    private LocalDateTime deletedOn;
}
