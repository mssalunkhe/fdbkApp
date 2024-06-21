package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.DivisionDto;

import java.util.List;

public interface DivisionService {
    public DivisionDto createDivision(DivisionDto DivisionDto);

    public DivisionDto getDivisionByID(int id);

    public List<DivisionDto> getAllDivisions();

    public DivisionDto updateDivision(int id, DivisionDto DivisionDto);

    public DivisionDto deleteDivision(int id);
}
