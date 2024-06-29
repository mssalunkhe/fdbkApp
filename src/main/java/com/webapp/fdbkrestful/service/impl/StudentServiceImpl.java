package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.mapper.StudentMapper;
import com.webapp.fdbkrestful.repository.StudentRepository;
import com.webapp.fdbkrestful.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student createdStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(createdStudent);
    }

    @Override
    public StudentDto getStudentByID(int id) {
        Student fetchedStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return StudentMapper.mapToStudentDto(fetchedStudent);
    }

    @Override
    public List<StudentDto> getAllStudents() {

        return studentRepository.findAll().stream().map(StudentMapper::mapToStudentDto).toList();
    }

    @Override
    public StudentDto updateStudent(int id, StudentDto studentDto) {
        Student fetchedStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedStudent.setName(studentDto.getName());
        fetchedStudent.setPRN(studentDto.getPRN());
        fetchedStudent.setYearOfAdmission(studentDto.getYearOfAdmission());
        studentRepository.save(fetchedStudent);
        return StudentMapper.mapToStudentDto(fetchedStudent);
    }

    @Override
    public StudentDto deleteStudent(int id) {
        Student fetchedStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        studentRepository.deleteById(id);
        return StudentMapper.mapToStudentDto(fetchedStudent);
    }
}
