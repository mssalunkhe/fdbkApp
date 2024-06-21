package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.DivisionDto;
import com.webapp.fdbkrestful.entity.Division;

public class DivisionMapper {
    public static DivisionDto mapToDivisionDto(Division Division) {
        return new DivisionDto(Division.getId(), Division.getName(), Division.getDescription());
    }

    public static Division mapToDivision(DivisionDto DivisionDto) {
        return new Division(DivisionDto.getId(), DivisionDto.getName(), DivisionDto.getDescription());
    }
}
