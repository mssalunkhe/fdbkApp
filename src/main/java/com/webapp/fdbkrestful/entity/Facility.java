package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.FacilityType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "facility")
public class Facility {
    @Id
    @Column(unique = true)
    private FacilityType name;
    @Column
    private String description;
}
