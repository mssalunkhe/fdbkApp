package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.DepartmentDto;
import com.webapp.fdbkrestful.entity.Department;
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    @PostMapping("/addDept")
    public String addDepartment(@Valid DepartmentDto departmentDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-dept";
        }
        departmentDto.setCreatedOn(LocalDateTime.now());
        Department department= DepartmentMapper.mapToDepartment(departmentDto);
        departmentRepository.save(department);
        model.addAttribute("department", department);
        return "redirect:deptList";
    }

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto createdDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }
    @GetMapping("/updateDept/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid department Id:" + id));

        model.addAttribute("departmentDto", DepartmentMapper.mapToDepartmentDto(department));
        return "update-dept";
    }

    @PostMapping("/updateDept/{id}")
    public String updateDepartment(@PathVariable("id") int id, @Valid DepartmentDto departmentDto, BindingResult result, Model model) {

            if (result.hasErrors()) {
                departmentDto.setId(id);
                return "update-dept";
            }
            departmentDto.setUpdatedOn(LocalDateTime.now());
            Department department=DepartmentMapper.mapToDepartment(departmentDto);
            departmentRepository.save(department);
        model.addAttribute("department", department);
        return "redirect:../deptList";


    }
    @GetMapping("/deleteDept/{id}")
    public String deleteDepartment(@PathVariable("id") int id, Model model) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid department Id:" + id));
        department.setDeletedOn(LocalDateTime.now());
        departmentRepository.save(department);

        return "redirect:../deptList";
    }


    @GetMapping("/deptList")
    public String showDeptList(Model model) {
        List<Department> departments= departmentRepository.findAll();
        departments=departments.stream().filter(entry->entry.getDeletedOn()==null).toList();
        model.addAttribute("departments", departments);
        return "dept-list";
    }
}
