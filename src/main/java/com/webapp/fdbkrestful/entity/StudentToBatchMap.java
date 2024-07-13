package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.Semester;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_to_batch_map")
public class StudentToBatchMap {

    @EmbeddedId
    StudentToBatchMapCompositeKey key;

    @Column(name = "roll_no")
    private int rollNo;

}
