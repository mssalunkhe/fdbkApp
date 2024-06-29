package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.StaffDto;
import com.webapp.fdbkrestful.entity.Staff;

public class StaffMapper extends UserMapper {
    public static StaffDto mapToStaffDto(Staff staff) {
        return StaffDto.builder().userID(staff.getUserID())
                .name(staff.getName())
                .email(staff.getEmail())
                .address(staff.getAddress())
                .mobile(staff.getMobile())
                .dateOfBirth(staff.getDateOfBirth())
                .staffId(staff.getStaffId())
                .type(staff.getType())
                .dateOfJoining(staff.getDateOfJoining())
                .build();
        // return new StaffDto(  staff.getType(),staff.getInstitute());//,staff.getEmail(),staff.getAddress(),staff.getDateOfBirth(),staff.getMobile());


    }

    public static Staff mapToStaff(StaffDto staffDto) {
        return Staff.builder().userID(staffDto.getUserID())
                .name(staffDto.getName())
                .email(staffDto.getEmail())
                .address(staffDto.getAddress())
                .mobile(staffDto.getMobile())
                .dateOfBirth(staffDto.getDateOfBirth())
                .staffId(staffDto.getStaffId())
                .type(staffDto.getType())
                .dateOfJoining(staffDto.getDateOfJoining())
                .build();
    }
}
