package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.entity.Department;
import com.webapp.fdbkrestful.mapper.DepartmentMapper;
import com.webapp.fdbkrestful.repository.DepartmentRepository;
import com.webapp.fdbkrestful.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department createdDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(createdDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByID(int id) {
        Department fetchedDepartment = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return DepartmentMapper.mapToDepartmentDto(fetchedDepartment);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {

        return departmentRepository.findAll().stream().map(DepartmentMapper::mapToDepartmentDto).toList();
    }

    @Override
    public DepartmentDto updateDepartment(int id, DepartmentDto departmentDto) {
        Department fetchedDepartment = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedDepartment.setName(departmentDto.getName());
        fetchedDepartment.setDescription(departmentDto.getDescription());
        departmentRepository.save(fetchedDepartment);
        return DepartmentMapper.mapToDepartmentDto(fetchedDepartment);
    }

    @Override
    public DepartmentDto deleteDepartment(int id) {
        Department fetchedDepartment = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        departmentRepository.deleteById(id);
        return DepartmentMapper.mapToDepartmentDto(fetchedDepartment);
    }
}
