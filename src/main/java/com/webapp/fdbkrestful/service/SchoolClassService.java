package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.SchoolClassDto;

import java.util.List;

public interface SchoolClassService {
    public SchoolClassDto createSchoolClass(SchoolClassDto SchoolClassDto);

    public SchoolClassDto getSchoolClassByID(int id);

    public List<SchoolClassDto> getAllSchoolClasses();

    public SchoolClassDto updateSchoolClass(int id, SchoolClassDto SchoolClassDto);

    public SchoolClassDto deleteSchoolClass(int id);
}
