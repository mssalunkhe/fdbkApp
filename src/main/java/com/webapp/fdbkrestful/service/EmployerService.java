package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.EmployerDto;

import java.util.List;

public interface EmployerService {
    public EmployerDto createEmployer(EmployerDto employerDto);

    public EmployerDto getEmployerByID(int id);

    public List<EmployerDto> getAllEmployers();

    public EmployerDto updateEmployer(int id, EmployerDto employerDto);

    public EmployerDto deleteEmployer(int id);
}
