package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/department")
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto createdDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("id") int id) {
        DepartmentDto fetchedDepartment = departmentService.getDepartmentByID(id);
        return ResponseEntity.ok(fetchedDepartment);
    }

    @GetMapping()
    public ResponseEntity<List<DepartmentDto>> getAllDepartments() {
        List<DepartmentDto> fetchedDepartmentes = departmentService.getAllDepartments();
        return ResponseEntity.ok(fetchedDepartmentes);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DepartmentDto> deleteDepartmentById(@PathVariable("id") int id) {
        DepartmentDto deletedDepartment = departmentService.deleteDepartment(id);
        return ResponseEntity.ok(deletedDepartment);
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> updateDepartment(@PathVariable("id") int id, @RequestBody DepartmentDto departmentDto) {
        DepartmentDto updatedDepartment = departmentService.updateDepartment(id, departmentDto);
        return ResponseEntity.ok(updatedDepartment);
    }
}
