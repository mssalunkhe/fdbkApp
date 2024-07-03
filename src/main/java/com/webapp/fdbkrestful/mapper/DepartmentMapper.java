package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.entity.Department;

import java.util.stream.Collectors;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(department.getId(), department.getName(), department.getClasses() == null ? null : department.getClasses().stream().map(SchoolClassMapper::mapToSchoolClassDto).collect(Collectors.toSet()), department.getStatus(), department.getDescription());
    }

    public static Department mapToDepartment(DepartmentDto departmentDto) {

        return new Department(departmentDto.getId(), departmentDto.getName(), departmentDto.getClasses() == null ? null : departmentDto.getClasses().stream().map(SchoolClassMapper::mapToSchoolClass).collect(Collectors.toSet()), departmentDto.getStatus(), departmentDto.getDescription());
    }
}
