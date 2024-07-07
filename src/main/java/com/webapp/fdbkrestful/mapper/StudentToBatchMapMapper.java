package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.entity.Student;
import com.webapp.fdbkrestful.entity.StudentToBatchMap;
import com.webapp.fdbkrestful.repository.BatchRepository;
import com.webapp.fdbkrestful.repository.StudentRepository;

public class StudentToBatchMapMapper {
    static StudentRepository studentRepository;
    static BatchRepository batchRepository;

    public static StudentToBatchMapDto mapToStudentToBatchMapDto(StudentToBatchMap studentToBatchMap) {

       
        int studentId = (int) studentToBatchMap.getStudentId();
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("No record found"));
        int batchId = (int) studentToBatchMap.getBatchId();
        Batch batch = batchRepository.findById(batchId).orElseThrow(() -> new RuntimeException("No record found"));

        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        BatchDto batchDto = BatchMapper.mapToBatchDto(batch);

        return new StudentToBatchMapDto(studentToBatchMap.getId(), studentDto, batchDto, studentToBatchMap.getRollNo(), studentToBatchMap.getAcademicYear(), studentToBatchMap.getSemester());
    }

    public static StudentToBatchMap mapToStudentToBatchMap(StudentToBatchMapDto studentToBatchMapDto) {
        return new StudentToBatchMap(studentToBatchMapDto.getId(), studentToBatchMapDto.getStudentDto().getUserID(), studentToBatchMapDto.getBatchDto().getId(), studentToBatchMapDto.getRollNo(), studentToBatchMapDto.getAcademicYear(), studentToBatchMapDto.getSemester());
    }
}
