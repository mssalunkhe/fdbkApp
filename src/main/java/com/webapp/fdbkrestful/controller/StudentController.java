package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.entity.User;
import com.webapp.fdbkrestful.repository.StudentRepository;
import com.webapp.fdbkrestful.service.StudentService;
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
@RequestMapping("api/student")
public class StudentController {
    private final StudentRepository studentRepository;
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        StudentDto createdStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    /*@GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") int id) {
        StudentDto fetchedStudent = studentService.getStudentByID(id);
        return ResponseEntity.ok(fetchedStudent);
    }*/

    @GetMapping()
    public ResponseEntity<List<StudentDto>> getAllStudents() {
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
    @GetMapping("/signup")
    public String showSignUpForm(Student student) {
        return "add-student";
    }
    @PostMapping("/addstudent")
    public String addStudent( @Valid Student  student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student";
        }

        studentRepository.save(student);
        return "redirect:index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
