package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.entity.StudentToBatchMapCompositeKey;

import java.util.List;

public interface StudentToBatchMapService {
    public StudentToBatchMapDto createStudentToBatchMap(StudentToBatchMapDto studentToBatchMapDto);

    //public StudentToBatchMapDto getStudentToBatchMapByID(StudentToBatchMapCompositeKey key);

    public List<StudentToBatchMapDto> getAllStudentToBatchMaps();

    //public StudentToBatchMapDto updateStudentToBatchMap(int id, StudentToBatchMapDto studentToBatchMapDto);

    //public StudentToBatchMapDto deleteStudentToBatchMap(StudentToBatchMapCompositeKey key);
}
