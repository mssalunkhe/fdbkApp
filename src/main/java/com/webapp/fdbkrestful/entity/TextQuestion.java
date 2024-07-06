package com.webapp.fdbkrestful.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@DiscriminatorValue("text_question")
@SuperBuilder
@Entity
public class TextQuestion extends Question {
    @Column
    private String answer;
}
