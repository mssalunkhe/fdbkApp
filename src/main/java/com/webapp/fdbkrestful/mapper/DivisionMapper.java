package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.DivisionDto;
import com.webapp.fdbkrestful.entity.Division;

import java.util.stream.Collectors;

public class DivisionMapper {
    public static DivisionDto mapToDivisionDto(Division division) {
        return new DivisionDto(division.getId(), division.getName(), division.getBatches() == null ? null : division.getBatches().stream().map(BatchMapper::mapToBatchDto).collect(Collectors.toSet()), division.getStatus(), division.getDescription(), 
                SchoolClassMapper.mapToSchoolClassDto(division.getSchoolClass()),division.getCreatedOn(),division.getUpdatedOn(),division.getDeletedOn());
    }

    public static Division mapToDivision(DivisionDto divisionDto) {
        return new Division(divisionDto.getId(), divisionDto.getName(), divisionDto.getBatches() == null ? null : divisionDto.getBatches().stream().map(BatchMapper::mapToBatch).collect(Collectors.toSet()), divisionDto.getStatus(), divisionDto.getDescription(),
                SchoolClassMapper.mapToSchoolClass(divisionDto.getSchoolClassDto()),divisionDto.getCreatedOn(),divisionDto.getUpdatedOn(),divisionDto.getDeletedOn());
    }
}
