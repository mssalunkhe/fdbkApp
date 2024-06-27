package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClassDto {
    int id;

    String name;
    Set<DivisionDto> divisions;
    Status status;
    String description;
}
