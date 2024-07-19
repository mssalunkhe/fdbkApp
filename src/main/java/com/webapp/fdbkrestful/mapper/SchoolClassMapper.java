package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.SchoolClassDto;
import com.webapp.fdbkrestful.entity.SchoolClass;

import java.util.stream.Collectors;

public class SchoolClassMapper {
    public static SchoolClassDto mapToSchoolClassDto(SchoolClass schoolClass) {
        return new SchoolClassDto(schoolClass.getId(), schoolClass.getName(), schoolClass.getDivisions() == null ? null : schoolClass.getDivisions().stream().map(DivisionMapper::mapToDivisionDto).collect(Collectors.toSet()), schoolClass.getStatus(), schoolClass.getDescription(), 
                DepartmentMapper.mapToDepartmentDto(schoolClass.getDepartment()),schoolClass.getCreatedOn(),schoolClass.getUpdatedOn(),schoolClass.getDeletedOn());
    }

    public static SchoolClass mapToSchoolClass(SchoolClassDto schoolClassDto) {
        return new SchoolClass(schoolClassDto.getId(), schoolClassDto.getName(), schoolClassDto.getDivisions() == null ? null : schoolClassDto.getDivisions().stream().map(DivisionMapper::mapToDivision).collect(Collectors.toSet()), schoolClassDto.getStatus(), schoolClassDto.getDescription(), 
                DepartmentMapper.mapToDepartment(schoolClassDto.getDepartmentDto()),schoolClassDto.getCreatedOn(),schoolClassDto.getUpdatedOn(),schoolClassDto.getDeletedOn());
    }
}
