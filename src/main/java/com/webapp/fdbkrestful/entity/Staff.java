package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.StaffType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staff")
public class Staff extends User {
    @Column
    private int id;
    @Column
    private StaffType type;
    @Column
    private Date dateOfJoining;
}
