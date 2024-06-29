package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.StaffDto;
import com.webapp.fdbkrestful.entity.Staff;
import com.webapp.fdbkrestful.mapper.StaffMapper;
import com.webapp.fdbkrestful.repository.StaffRepository;
import com.webapp.fdbkrestful.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StaffServiceImpl implements StaffService {
    StaffRepository staffRepository;

    @Override
    public StaffDto createStaff(StaffDto staffDto) {
        Staff staff = StaffMapper.mapToStaff(staffDto);
        Staff createdStaff = staffRepository.save(staff);
        return StaffMapper.mapToStaffDto(createdStaff);
    }

    @Override
    public StaffDto getStaffByID(int id) {
        Staff fetchedStaff = staffRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return StaffMapper.mapToStaffDto(fetchedStaff);
    }

    @Override
    public List<StaffDto> getAllStaffs() {

        return staffRepository.findAll().stream().map(StaffMapper::mapToStaffDto).toList();
    }

    @Override
    public StaffDto updateStaff(int id, StaffDto staffDto) {
        Staff fetchedStaff = staffRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedStaff.setName(staffDto.getName());
        fetchedStaff.setStaffId(staffDto.getStaffId());
        fetchedStaff.setDateOfJoining(staffDto.getDateOfJoining());
        staffRepository.save(fetchedStaff);
        return StaffMapper.mapToStaffDto(fetchedStaff);
    }

    @Override
    public StaffDto deleteStaff(int id) {
        Staff fetchedStaff = staffRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        staffRepository.deleteById(id);
        return StaffMapper.mapToStaffDto(fetchedStaff);
    }
}
