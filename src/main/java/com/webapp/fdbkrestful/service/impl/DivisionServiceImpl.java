package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.DivisionDto;
import com.webapp.fdbkrestful.entity.Division;
import com.webapp.fdbkrestful.mapper.DivisionMapper;
import com.webapp.fdbkrestful.repository.DivisionRepository;
import com.webapp.fdbkrestful.service.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DivisionServiceImpl implements DivisionService {
    DivisionRepository DivisionRepository;

    @Override
    public DivisionDto createDivision(DivisionDto DivisionDto) {
        Division Division = DivisionMapper.mapToDivision(DivisionDto);
        Division createdDivision = DivisionRepository.save(Division);
        return DivisionMapper.mapToDivisionDto(createdDivision);
    }

    @Override
    public DivisionDto getDivisionByID(int id) {
        Division fetchedDivision = DivisionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return DivisionMapper.mapToDivisionDto(fetchedDivision);
    }

    @Override
    public List<DivisionDto> getAllDivisions() {

        return DivisionRepository.findAll().stream().map(DivisionMapper::mapToDivisionDto).toList();
    }

    @Override
    public DivisionDto updateDivision(int id, DivisionDto DivisionDto) {
        Division fetchedDivision = DivisionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedDivision.setName(DivisionDto.getName());
        fetchedDivision.setDescription(DivisionDto.getDescription());
        DivisionRepository.save(fetchedDivision);
        return DivisionMapper.mapToDivisionDto(fetchedDivision);
    }

    @Override
    public DivisionDto deleteDivision(int id) {
        Division fetchedDivision = DivisionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        DivisionRepository.deleteById(id);
        return DivisionMapper.mapToDivisionDto(fetchedDivision);
    }
}
