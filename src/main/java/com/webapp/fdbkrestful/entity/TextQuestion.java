package com.webapp.fdbkrestful.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@DiscriminatorValue("text_question")
@SuperBuilder
public class TextQuestion {
    @Column
    private String answer;
}
