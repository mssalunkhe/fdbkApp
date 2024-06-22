package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.VisitorType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visitor")
public class Visitor extends User {
    @Column
    private VisitorType type;
    @Column
    private String city;
    @Column
    private String institute;
}
