package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.entity.Department;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.mapper.DepartmentMapper;
import com.webapp.fdbkrestful.repository.DepartmentRepository;
import com.webapp.fdbkrestful.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("api/department")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;
    private DepartmentService departmentService;

    @GetMapping("/addDept")
    public String showAddDeptForm(DepartmentDto departmentDto) {
        return "add-dept";

    }

    @PostMapping("/adddepartment")
    public String addDepartment(@Valid DepartmentDto departmentDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-dept";
        }
        Department department= DepartmentMapper.mapToDepartment(departmentDto);
        departmentRepository.save(department);
        model.addAttribute("department", department);
        return "redirect:index";
    }

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
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("deartments", departmentRepository.findAll());
        return "index";
    }
}
