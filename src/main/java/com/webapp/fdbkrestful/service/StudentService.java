package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto createStudent(StudentDto studentDto);

    public StudentDto getStudentByID(int id);

    public List<StudentDto> getAllStudents();

    public StudentDto updateStudent(int id, StudentDto studentDto);

    public StudentDto deleteStudent(int id);
}
