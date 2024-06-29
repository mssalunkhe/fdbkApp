package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.StudentToDivisionMapDto;

import java.util.List;

public interface StudentToDivisionMapService {
    public StudentToDivisionMapDto createStudentToDivisionMap(StudentToDivisionMapDto studentToDivisionMapDto);

    public StudentToDivisionMapDto getStudentToDivisionMapByID(int id);

    public List<StudentToDivisionMapDto> getAllStudentToDivisionMaps();

    public StudentToDivisionMapDto updateStudentToDivisionMap(int id, StudentToDivisionMapDto studentToDivisionMapDto);

    public StudentToDivisionMapDto deleteStudentToDivisionMap(int id);
}
