package com.webapp.fdbkrestful.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class StudentToBatchMapCompositeKey implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",referencedColumnName = "userid")
    Student student;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "batch_id",referencedColumnName = "id")
    Batch batch;
}
