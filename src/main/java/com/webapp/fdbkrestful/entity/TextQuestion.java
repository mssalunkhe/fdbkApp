package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "question_type",
        discriminatorType = DiscriminatorType.STRING)
@Table(name = "questions")
@Data
@SuperBuilder
public class TextQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column
    protected String text;
    @Column
    protected LocalDateTime createdOn;
    @Column
    protected LocalDateTime updatedOn;
    @Column
    protected LocalDateTime deletedOn;
}
