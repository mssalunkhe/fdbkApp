package com.webapp.fdbkrestful.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

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

    protected String mobile;

    protected Date dateOfBirth;
}
