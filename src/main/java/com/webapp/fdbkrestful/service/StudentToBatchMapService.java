package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;

import java.util.List;

public interface StudentToBatchMapService {
    public StudentToBatchMapDto createStudentToBatchMap(StudentToBatchMapDto studentToBatchMapDto);

    public StudentToBatchMapDto getStudentToBatchMapByID(int id);

    public List<StudentToBatchMapDto> getAllStudentToBatchMaps();

    public StudentToBatchMapDto updateStudentToBatchMap(int id, StudentToBatchMapDto studentToBatchMapDto);

    public StudentToBatchMapDto deleteStudentToBatchMap(int id);
}
