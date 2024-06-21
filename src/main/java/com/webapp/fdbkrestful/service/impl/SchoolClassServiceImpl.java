package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.SchoolClassDto;
import com.webapp.fdbkrestful.entity.SchoolClass;
import com.webapp.fdbkrestful.mapper.SchoolClassMapper;
import com.webapp.fdbkrestful.repository.SchoolClassRepository;
import com.webapp.fdbkrestful.service.SchoolClassService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolClassServiceImpl implements SchoolClassService {
    SchoolClassRepository schoolClassRepository;

    @Override
    public SchoolClassDto createSchoolClass(SchoolClassDto schoolClassDto) {
        SchoolClass schoolClass = SchoolClassMapper.mapToSchoolClass(schoolClassDto);
        SchoolClass createdSchoolClass = schoolClassRepository.save(schoolClass);
        return SchoolClassMapper.mapToSchoolClassDto(createdSchoolClass);
    }

    @Override
    public SchoolClassDto getSchoolClassByID(int id) {
        SchoolClass fetchedSchoolClass = schoolClassRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return SchoolClassMapper.mapToSchoolClassDto(fetchedSchoolClass);
    }

    @Override
    public List<SchoolClassDto> getAllSchoolClasses() {

        return schoolClassRepository.findAll().stream().map(SchoolClassMapper::mapToSchoolClassDto).toList();
    }

    @Override
    public SchoolClassDto updateSchoolClass(int id, SchoolClassDto SchoolClassDto) {
        SchoolClass fetchedSchoolClass = schoolClassRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedSchoolClass.setName(SchoolClassDto.getName());
        fetchedSchoolClass.setDescription(SchoolClassDto.getDescription());
        schoolClassRepository.save(fetchedSchoolClass);
        return SchoolClassMapper.mapToSchoolClassDto(fetchedSchoolClass);
    }

    @Override
    public SchoolClassDto deleteSchoolClass(int id) {
        SchoolClass fetchedSchoolClass = schoolClassRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        schoolClassRepository.deleteById(id);
        return SchoolClassMapper.mapToSchoolClassDto(fetchedSchoolClass);
    }
}
