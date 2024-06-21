package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    public DepartmentDto createDepartment(DepartmentDto DepartmentDto);

    public DepartmentDto getDepartmentByID(int id);

    public List<DepartmentDto> getAllDepartments();

    public DepartmentDto updateDepartment(int id, DepartmentDto DepartmentDto);

    public DepartmentDto deleteDepartment(int id);
}
