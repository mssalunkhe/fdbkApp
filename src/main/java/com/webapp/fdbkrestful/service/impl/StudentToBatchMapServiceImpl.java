package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.entity.StudentToBatchMap;
import com.webapp.fdbkrestful.mapper.StudentToBatchMapMapper;
import com.webapp.fdbkrestful.repository.StudentToBatchMapRepository;
import com.webapp.fdbkrestful.service.StudentToBatchMapService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentToBatchMapServiceImpl implements StudentToBatchMapService {
    StudentToBatchMapRepository studentToBatchMapRepository;

    @Override
    public StudentToBatchMapDto createStudentToBatchMap(StudentToBatchMapDto studentToBatchMapDto) {
        StudentToBatchMap studentToBatchMap = StudentToBatchMapMapper.mapToStudentToBatchMap(studentToBatchMapDto);
        StudentToBatchMap createdStudentToBatchMap = studentToBatchMapRepository.save(studentToBatchMap);
        return StudentToBatchMapMapper.mapToStudentToBatchMapDto(createdStudentToBatchMap);
    }

    @Override
    public StudentToBatchMapDto getStudentToBatchMapByID(int id) {
        StudentToBatchMap fetchedStudentToBatchMap = studentToBatchMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return StudentToBatchMapMapper.mapToStudentToBatchMapDto(fetchedStudentToBatchMap);
    }

    @Override
    public List<StudentToBatchMapDto> getAllStudentToBatchMaps() {

        return studentToBatchMapRepository.findAll().stream().map(StudentToBatchMapMapper::mapToStudentToBatchMapDto).toList();
    }

    @Override
    public StudentToBatchMapDto updateStudentToBatchMap(int id, StudentToBatchMapDto studentToBatchMapDto) {
        StudentToBatchMap fetchedStudentToBatchMap = studentToBatchMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedStudentToBatchMap.setStudentId(studentToBatchMapDto.getStudentDto().getUserID());
        fetchedStudentToBatchMap.setBatchId(studentToBatchMapDto.getBatchDto().getId());
        studentToBatchMapRepository.save(fetchedStudentToBatchMap);
        return StudentToBatchMapMapper.mapToStudentToBatchMapDto(fetchedStudentToBatchMap);
    }

    @Override
    public StudentToBatchMapDto deleteStudentToBatchMap(int id) {
        StudentToBatchMap fetchedStudentToBatchMap = studentToBatchMapRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        studentToBatchMapRepository.deleteById(id);
        return StudentToBatchMapMapper.mapToStudentToBatchMapDto(fetchedStudentToBatchMap);
    }
}
