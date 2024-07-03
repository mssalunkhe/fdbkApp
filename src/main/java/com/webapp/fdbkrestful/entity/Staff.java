package com.webapp.fdbkrestful.entity;


import com.webapp.fdbkrestful.utility.StaffType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorValue("staff")
//@Table(name = "staff")
public class Staff extends User {
    @Column
    private int staffId;
    @Column
    private StaffType type;
    @Column
    private Date dateOfJoining;

}
