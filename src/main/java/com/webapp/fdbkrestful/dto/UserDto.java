package com.webapp.fdbkrestful.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor

public class UserDto {
    protected long userID;

    protected String address;

    protected String name;

    protected String email;

    protected String password;

    protected String mobile;

    protected Date dateOfBirth;

    protected LocalDateTime createdOn;

    protected LocalDateTime updatedOn;

    protected LocalDateTime deletedOn;
}
