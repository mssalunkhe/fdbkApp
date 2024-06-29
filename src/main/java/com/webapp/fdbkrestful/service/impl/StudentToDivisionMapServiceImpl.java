package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.StudentToDivisionMapDto;
import com.webapp.fdbkrestful.entity.StudentToDivisionMap;
import com.webapp.fdbkrestful.mapper.StudentToDivisionMapMapper;
import com.webapp.fdbkrestful.repository.StudentToDivisionMapRepository;
import com.webapp.fdbkrestful.service.StudentToDivisionMapService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentToDivisionMapServiceImpl implements StudentToDivisionMapService {
    StudentToDivisionMapRepository studentToDivisionMapRepository;

    @Override
    public StudentToDivisionMapDto createStudentToDivisionMap(StudentToDivisionMapDto studentToDivisionMapDto) {
        StudentToDivisionMap studentToDivisionMap = StudentToDivisionMapMapper.mapToStudentToDivisionMap(studentToDivisionMapDto);
        StudentToDivisionMap createdStudentToDivisionMap = studentToDivisionMapRepository.save(studentToDivisionMap);
        return StudentToDivisionMapMapper.mapToStudentToDivisionMapDto(createdStudentToDivisionMap);
    }

    @Override
    public StudentToDivisionMapDto getStudentToDivisionMapByID(int id) {
        StudentToDivisionMap fetchedStudentToDivisionMap = studentToDivisionMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return StudentToDivisionMapMapper.mapToStudentToDivisionMapDto(fetchedStudentToDivisionMap);
    }

    @Override
    public List<StudentToDivisionMapDto> getAllStudentToDivisionMaps() {

        return studentToDivisionMapRepository.findAll().stream().map(StudentToDivisionMapMapper::mapToStudentToDivisionMapDto).toList();
    }

    @Override
    public StudentToDivisionMapDto updateStudentToDivisionMap(int id, StudentToDivisionMapDto studentToDivisionMapDto) {
        StudentToDivisionMap fetchedStudentToDivisionMap = studentToDivisionMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedStudentToDivisionMap.setStudentId(studentToDivisionMapDto.getStudentDto().getUserID());
        fetchedStudentToDivisionMap.setBatchId(studentToDivisionMapDto.getBatchDto().getId());
        studentToDivisionMapRepository.save(fetchedStudentToDivisionMap);
        return StudentToDivisionMapMapper.mapToStudentToDivisionMapDto(fetchedStudentToDivisionMap);
    }

    @Override
    public StudentToDivisionMapDto deleteStudentToDivisionMap(int id) {
        StudentToDivisionMap fetchedStudentToDivisionMap = studentToDivisionMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        studentToDivisionMapRepository.deleteById(id);
        return StudentToDivisionMapMapper.mapToStudentToDivisionMapDto(fetchedStudentToDivisionMap);
    }
}
