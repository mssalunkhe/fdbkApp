package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.utility.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    int id;
    String name;
    Set<SchoolClassDto> classes;
    private String abbreviation;
    Status status;
    String description;
    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private LocalDateTime deletedOn;
}
