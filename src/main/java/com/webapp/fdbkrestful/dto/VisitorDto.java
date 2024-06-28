package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.VisitorType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter

@SuperBuilder
@NoArgsConstructor


public class VisitorDto extends UserDto {
    private VisitorType type;


    private String institute;
}
