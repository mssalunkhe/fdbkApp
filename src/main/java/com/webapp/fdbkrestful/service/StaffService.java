package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.StaffDto;

import java.util.List;

public interface StaffService {
    public StaffDto createStaff(StaffDto staffDto);

    public StaffDto getStaffByID(int id);

    public List<StaffDto> getAllStaffs();

    public StaffDto updateStaff(int id, StaffDto staffDto);

    public StaffDto deleteStaff(int id);
}
