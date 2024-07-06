package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@Embeddable
class AssignmentId implements Serializable {
    private int batchToCourseSetMapId;
    private int courseId;
    private int batchId;

}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "batchcourseset_to_faculty_map")

public class BatchCourseSetToFacultyMap {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "batchtocoursesetmap_id", referencedColumnName = "id")
    @Id
    private BatchToCourseSetMap batchToCourseSetMap;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_staff_mapping",
            joinColumns = {@JoinColumn(name = "mapid", referencedColumnName = "batchtocoursesetmap_id")},
            inverseJoinColumns = {@JoinColumn(name = "staff_id", referencedColumnName = "userID")})
    @MapKeyJoinColumn(name = "course_id")
    private Map<Course, Staff> courseToStaffMap;


}
