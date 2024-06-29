package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.dto.StudentToDivisionMapDto;
import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.entity.StudentToDivisionMap;
import com.webapp.fdbkrestful.repository.BatchRepository;
import com.webapp.fdbkrestful.repository.StudentRepository;

public class StudentToDivisionMapMapper {
    static StudentRepository studentRepository;
    static BatchRepository batchRepository;

    public static StudentToDivisionMapDto mapToStudentToDivisionMapDto(StudentToDivisionMap studentToDivisionMap) {

       
        int studentId = (int) studentToDivisionMap.getStudentId();
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("No record found"));
        int batchId = (int) studentToDivisionMap.getBatchId();
        Batch batch = batchRepository.findById(batchId).orElseThrow(() -> new RuntimeException("No record found"));

        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        BatchDto batchDto = BatchMapper.mapToBatchDto(batch);

        return new StudentToDivisionMapDto(studentToDivisionMap.getId(), studentDto, batchDto, studentToDivisionMap.getRollNo(), studentToDivisionMap.getAcademicYear(), studentToDivisionMap.getSemester());
    }

    public static StudentToDivisionMap mapToStudentToDivisionMap(StudentToDivisionMapDto studentToDivisionMapDto) {
        return new StudentToDivisionMap(studentToDivisionMapDto.getId(), studentToDivisionMapDto.getStudentDto().getUserID(), studentToDivisionMapDto.getBatchDto().getId(), studentToDivisionMapDto.getRollNo(), studentToDivisionMapDto.getAcademicYear(), studentToDivisionMapDto.getSemester());
    }
}
