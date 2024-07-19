package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "divisions")
@Data
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;
    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    Set<Batch> batches;
    @Column
    private Status status;
    @Column
    String description;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private SchoolClass schoolClass;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
    @Column
    private LocalDateTime deletedOn;
}
