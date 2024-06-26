package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.VisitorType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "visitors")
public class Visitor extends User {
    @Column
    private VisitorType type;

    @Column
    private String institute;
}
