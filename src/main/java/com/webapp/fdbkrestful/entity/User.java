package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
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
@Table(name = "user")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    @Column
    private String address;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String mobile;
    @Column
    private Date dateOfBirth;
}
