package com.webapp.fdbkrestful.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
/*@Entity
@Table(name = "users")*/
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type",
        discriminatorType = DiscriminatorType.STRING)
@Table(name = "users")
//@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long userID;
    @Column
    protected String address;
    @Column
    @NotBlank(message = "Name is mandatory")
    protected String name;
    @Column
    @NotBlank(message = "Email is mandatory")
    protected String email;
    @Column
    protected String password;
    @Column
    protected String mobile;
    @Column
    protected Date dateOfBirth;
    @Column
    protected LocalDateTime createdOn;
    @Column
    protected LocalDateTime updatedOn;
    @Column
    protected LocalDateTime deletedOn;


}
