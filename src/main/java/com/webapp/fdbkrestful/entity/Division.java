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
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "div_id", referencedColumnName = "id")
    Set<Batch> batches;
    @Column
    private Status status;
    @Column
    String description;
}
