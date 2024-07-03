package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.VisitorType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorValue("visitor")
//@Table(name = "visitors")
public class Visitor extends User {
    @Column
    private VisitorType type;

    @Column
    private String institute;
}
