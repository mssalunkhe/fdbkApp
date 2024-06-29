package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.EmployerDto;
import com.webapp.fdbkrestful.entity.Employer;
import com.webapp.fdbkrestful.mapper.EmployerMapper;
import com.webapp.fdbkrestful.repository.EmployerRepository;
import com.webapp.fdbkrestful.service.EmployerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployerServiceImpl implements EmployerService {
    EmployerRepository employerRepository;

    @Override
    public EmployerDto createEmployer(EmployerDto employerDto) {
        Employer employer = EmployerMapper.mapToEmployer(employerDto);
        Employer createdEmployer = employerRepository.save(employer);
        return EmployerMapper.mapToEmployerDto(createdEmployer);
    }

    @Override
    public EmployerDto getEmployerByID(int id) {
        Employer fetchedEmployer = employerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return EmployerMapper.mapToEmployerDto(fetchedEmployer);
    }

    @Override
    public List<EmployerDto> getAllEmployers() {

        return employerRepository.findAll().stream().map(EmployerMapper::mapToEmployerDto).toList();
    }

    @Override
    public EmployerDto updateEmployer(int id, EmployerDto employerDto) {
        Employer fetchedEmployer = employerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedEmployer.setName(employerDto.getName());
        fetchedEmployer.setCompany(employerDto.getCompany());
        fetchedEmployer.setDesignation(employerDto.getDesignation());
        employerRepository.save(fetchedEmployer);
        return EmployerMapper.mapToEmployerDto(fetchedEmployer);
    }

    @Override
    public EmployerDto deleteEmployer(int id) {
        Employer fetchedEmployer = employerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        employerRepository.deleteById(id);
        return EmployerMapper.mapToEmployerDto(fetchedEmployer);
    }
}
