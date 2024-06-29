package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.StudentToDivisionMapDto;
import com.webapp.fdbkrestful.service.StudentToDivisionMapService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/studentToDivisionMap")
public class StudentToDivMapController {
    private StudentToDivisionMapService studentToDivisionMapService;

    @PostMapping
    public ResponseEntity<StudentToDivisionMapDto> createStudentToDivisionMap(@RequestBody StudentToDivisionMapDto studentToDivisionMapDto) {
        StudentToDivisionMapDto createdStudentToDivisionMap = studentToDivisionMapService.createStudentToDivisionMap(studentToDivisionMapDto);
        return new ResponseEntity<>(createdStudentToDivisionMap, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentToDivisionMapDto> getStudentToDivisionMapById(@PathVariable("id") int id) {
        StudentToDivisionMapDto fetchedStudentToDivisionMap = studentToDivisionMapService.getStudentToDivisionMapByID(id);
        return ResponseEntity.ok(fetchedStudentToDivisionMap);
    }

    @GetMapping()
    public ResponseEntity<List<StudentToDivisionMapDto>> getAllStudentToDivisionMapes() {
        List<StudentToDivisionMapDto> fetchedStudentToDivisionMaps = studentToDivisionMapService.getAllStudentToDivisionMaps();
        return ResponseEntity.ok(fetchedStudentToDivisionMaps);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StudentToDivisionMapDto> deleteStudentToDivisionMapById(@PathVariable("id") int id) {
        StudentToDivisionMapDto deletedStudentToDivisionMap = studentToDivisionMapService.deleteStudentToDivisionMap(id);
        return ResponseEntity.ok(deletedStudentToDivisionMap);
    }

    @PutMapping("{id}")
    public ResponseEntity<StudentToDivisionMapDto> updateStudentToDivisionMap(@PathVariable("id") int id, @RequestBody StudentToDivisionMapDto studentToDivisionMapDto) {
        StudentToDivisionMapDto updatedStudentToDivisionMap = studentToDivisionMapService.updateStudentToDivisionMap(id, studentToDivisionMapDto);
        return ResponseEntity.ok(updatedStudentToDivisionMap);
    }
}
