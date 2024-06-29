package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.EmployerDto;
import com.webapp.fdbkrestful.service.EmployerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/employer")
public class EmployerController {
    private EmployerService employerService;

    @PostMapping
    public ResponseEntity<EmployerDto> createEmployer(@RequestBody EmployerDto employerDto) {
        EmployerDto createdEmployer = employerService.createEmployer(employerDto);
        return new ResponseEntity<>(createdEmployer, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployerDto> getEmployerById(@PathVariable("id") int id) {
        EmployerDto fetchedEmployer = employerService.getEmployerByID(id);
        return ResponseEntity.ok(fetchedEmployer);
    }

    @GetMapping()
    public ResponseEntity<List<EmployerDto>> getAllEmployeres() {
        List<EmployerDto> fetchedEmployers = employerService.getAllEmployers();
        return ResponseEntity.ok(fetchedEmployers);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<EmployerDto> deleteEmployerById(@PathVariable("id") int id) {
        EmployerDto deletedEmployer = employerService.deleteEmployer(id);
        return ResponseEntity.ok(deletedEmployer);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployerDto> updateEmployer(@PathVariable("id") int id, @RequestBody EmployerDto employerDto) {
        EmployerDto updatedEmployer = employerService.updateEmployer(id, employerDto);
        return ResponseEntity.ok(updatedEmployer);
    }
}
