package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "batchcourseset_to_faculty_map")
@Data
public class BatchToCourseToStaffMap {
    @EmbeddedId
    BatchToCourseCompositeKey key;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_userid",referencedColumnName = "userid")
    private Set<Staff> staff;


}
