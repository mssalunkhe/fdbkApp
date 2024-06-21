package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.SchoolClassDto;
import com.webapp.fdbkrestful.entity.SchoolClass;

public class SchoolClassMapper {
    public static SchoolClassDto mapToSchoolClassDto(SchoolClass SchoolClass) {
        return new SchoolClassDto(SchoolClass.getId(), SchoolClass.getName(), SchoolClass.getDescription());
    }

    public static SchoolClass mapToSchoolClass(SchoolClassDto SchoolClassDto) {
        return new SchoolClass(SchoolClassDto.getId(), SchoolClassDto.getName(), SchoolClassDto.getDescription());
    }
}
