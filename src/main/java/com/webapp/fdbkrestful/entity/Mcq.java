package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("mcq")

public class Mcq extends Question {
    @ElementCollection
    @CollectionTable(name = "question_options_mapping",
            joinColumns = {@JoinColumn(name = "question_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "option_text")
    @Column(name = "numeric_val")
    private Map<String, Double> options;
    @Column
    private float answer;
}
