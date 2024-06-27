package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Embeddable
class AssignmentId implements Serializable {
    private int divToCourseSetMapId;
    private int courseId;
    private int batchId;

}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "divcourseset_to_faculty_map")

public abstract class DivCourseSetToFacultyMap {
    @EmbeddedId
    private AssignmentId assignmentId;
    @OneToMany
    private Set<Staff> staff;


}
