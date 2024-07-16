package com.webapp.fdbkrestful.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;
//import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@DiscriminatorValue("mcq")
@Entity
@Data
public class Mcq extends TextQuestion {
    @ElementCollection
    @CollectionTable(name = "question_options_mapping",
            joinColumns = {@JoinColumn(name = "question_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "option_text")
    @Column(name = "numeric_val")
    private Map<String, Double> options;

}
