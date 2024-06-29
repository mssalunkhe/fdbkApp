package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.StaffDto;
import com.webapp.fdbkrestful.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/staff")
public class StaffController {
    private StaffService staffService;

    @PostMapping
    public ResponseEntity<StaffDto> createStaff(@RequestBody StaffDto staffDto) {
        StaffDto createdStaff = staffService.createStaff(staffDto);
        return new ResponseEntity<>(createdStaff, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<StaffDto> getStaffById(@PathVariable("id") int id) {
        StaffDto fetchedStaff = staffService.getStaffByID(id);
        return ResponseEntity.ok(fetchedStaff);
    }

    @GetMapping()
    public ResponseEntity<List<StaffDto>> getAllStaffes() {
        List<StaffDto> fetchedStaffs = staffService.getAllStaffs();
        return ResponseEntity.ok(fetchedStaffs);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StaffDto> deleteStaffById(@PathVariable("id") int id) {
        StaffDto deletedStaff = staffService.deleteStaff(id);
        return ResponseEntity.ok(deletedStaff);
    }

    @PutMapping("{id}")
    public ResponseEntity<StaffDto> updateStaff(@PathVariable("id") int id, @RequestBody StaffDto staffDto) {
        StaffDto updatedStaff = staffService.updateStaff(id, staffDto);
        return ResponseEntity.ok(updatedStaff);
    }
}
