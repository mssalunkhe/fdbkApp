package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.StaffType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor
public class StaffDto extends UserDto {

    private int staffId;

    private StaffType type;

    private Date dateOfJoining;
}
