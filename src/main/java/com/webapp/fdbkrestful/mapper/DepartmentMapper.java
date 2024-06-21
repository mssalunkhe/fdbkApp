package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department Department) {
        return new DepartmentDto(Department.getId(), Department.getName(), Department.getDescription());
    }

    public static Department mapToDepartment(DepartmentDto DepartmentDto) {
        return new Department(DepartmentDto.getId(), DepartmentDto.getName(), DepartmentDto.getDescription());
    }
}
