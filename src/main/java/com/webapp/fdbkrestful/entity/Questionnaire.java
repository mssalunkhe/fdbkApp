package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

@Table(name = "questionnaire")

public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany
    @JoinTable(name = "questionnaire_questions",
            joinColumns = @JoinColumn(name = "questionnaire_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id"))
    Set<TextQuestion> questions;

    @Column
    private String title;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
    @Column
    private LocalDateTime deletedOn;
}
