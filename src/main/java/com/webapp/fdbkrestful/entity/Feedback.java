package com.webapp.fdbkrestful.entity;

import com.webapp.fdbkrestful.utility.FacilityType;
import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private String academicYear;
    @Column
    private Semester semester;
    @Column
    private FacilityType onFacility;
    @OneToMany(targetEntity = User.class)
    private Set<User> givers;
    @OneToMany(targetEntity = User.class)
    private Set<User> takers;
    @OneToOne(targetEntity = Questionnaire.class)
    private Questionnaire questionnaire;
    @Column
    private String description;


}
