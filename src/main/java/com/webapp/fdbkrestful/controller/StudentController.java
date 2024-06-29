package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/student")
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        StudentDto createdStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") int id) {
        StudentDto fetchedStudent = studentService.getStudentByID(id);
        return ResponseEntity.ok(fetchedStudent);
    }

    @GetMapping()
    public ResponseEntity<List<StudentDto>> getAllStudentes() {
        List<StudentDto> fetchedStudents = studentService.getAllStudents();
        return ResponseEntity.ok(fetchedStudents);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StudentDto> deleteStudentById(@PathVariable("id") int id) {
        StudentDto deletedStudent = studentService.deleteStudent(id);
        return ResponseEntity.ok(deletedStudent);
    }

    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
        StudentDto updatedStudent = studentService.updateStudent(id, studentDto);
        return ResponseEntity.ok(updatedStudent);
    }
}
