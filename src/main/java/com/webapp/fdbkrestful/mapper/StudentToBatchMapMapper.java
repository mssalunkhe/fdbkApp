package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.entity.StudentToBatchMapCompositeKey;
import com.webapp.fdbkrestful.entity.StudentToBatchMap;
import com.webapp.fdbkrestful.repository.BatchRepository;
import com.webapp.fdbkrestful.repository.StudentRepository;


public class StudentToBatchMapMapper {
    static StudentRepository studentRepository;
    static BatchRepository batchRepository;

    public static StudentToBatchMapDto mapToStudentToBatchMapDto(StudentToBatchMap studentToBatchMap) {

       

        return new StudentToBatchMapDto(StudentMapper.mapToStudentDto(studentToBatchMap.getStudentToBatchMapCompositeKey().getStudent()),
                BatchMapper.mapToBatchDto(studentToBatchMap.getStudentToBatchMapCompositeKey().getBatch()),
                studentToBatchMap.getStudentToBatchMapCompositeKey().getAcademicYear(),studentToBatchMap.getStudentToBatchMapCompositeKey().getSemester(), studentToBatchMap.getRollNo());
    }

    public static StudentToBatchMap mapToStudentToBatchMap(StudentToBatchMapDto studentToBatchMapDto) {
         StudentToBatchMapCompositeKey key=new StudentToBatchMapCompositeKey(StudentMapper.mapToStudent(studentToBatchMapDto.getStudentDto()),
                 BatchMapper.mapToBatch(studentToBatchMapDto.getBatchDto())
                , studentToBatchMapDto.getAcademicYear(),studentToBatchMapDto.getSemester());
        return new StudentToBatchMap(key,studentToBatchMapDto.getRollNo());
    }
}
