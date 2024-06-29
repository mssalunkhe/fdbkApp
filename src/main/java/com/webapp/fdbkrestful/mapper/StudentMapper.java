package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.entity.Student;

public class StudentMapper extends UserMapper {
    public static StudentDto mapToStudentDto(Student student) {
        return StudentDto.builder().userID(student.getUserID())
                .name(student.getName())
                .email(student.getEmail())
                .address(student.getAddress())
                .mobile(student.getMobile())
                .dateOfBirth(student.getDateOfBirth())
                .PRN(student.getPRN())
                .yearOfAdmission(student.getYearOfAdmission())
                .build();
        // return new StudentDto(  student.getType(),student.getInstitute());//,student.getEmail(),student.getAddress(),student.getDateOfBirth(),student.getMobile());


    }

    public static Student mapToStudent(StudentDto studentDto) {
        return Student.builder().userID(studentDto.getUserID())
                .name(studentDto.getName())
                .email(studentDto.getEmail())
                .address(studentDto.getAddress())
                .mobile(studentDto.getMobile())
                .dateOfBirth(studentDto.getDateOfBirth())
                .PRN(studentDto.getPRN())
                .yearOfAdmission(studentDto.getYearOfAdmission())
                .build();
    }
}
