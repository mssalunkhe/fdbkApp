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
public class DivisionDto {
    int id;
    String name;
    Set<BatchDto> batches;
    Status status;
    String description;
    private SchoolClassDto schoolClassDto;
}
