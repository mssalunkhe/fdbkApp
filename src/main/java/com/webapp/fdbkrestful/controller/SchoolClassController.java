package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.SchoolClassDto;
import com.webapp.fdbkrestful.service.SchoolClassService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/class")
public class SchoolClassController {
    private SchoolClassService SchoolClassService;

    @PostMapping
    public ResponseEntity<SchoolClassDto> createSchoolClass(@RequestBody SchoolClassDto SchoolClassDto) {
        SchoolClassDto createdSchoolClass = SchoolClassService.createSchoolClass(SchoolClassDto);
        return new ResponseEntity<>(createdSchoolClass, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<SchoolClassDto> getSchoolClassById(@PathVariable("id") int id) {
        SchoolClassDto fetchedSchoolClass = SchoolClassService.getSchoolClassByID(id);
        return ResponseEntity.ok(fetchedSchoolClass);
    }

    @GetMapping()
    public ResponseEntity<List<SchoolClassDto>> getAllSchoolClasses() {
        List<SchoolClassDto> fetchedSchoolClasses = SchoolClassService.getAllSchoolClasses();
        return ResponseEntity.ok(fetchedSchoolClasses);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<SchoolClassDto> deleteSchoolClassById(@PathVariable("id") int id) {
        SchoolClassDto deletedSchoolClass = SchoolClassService.deleteSchoolClass(id);
        return ResponseEntity.ok(deletedSchoolClass);
    }

    @PutMapping("{id}")
    public ResponseEntity<SchoolClassDto> updateSchoolClass(@PathVariable("id") int id, @RequestBody SchoolClassDto SchoolClassDto) {
        SchoolClassDto updatedSchoolClass = SchoolClassService.updateSchoolClass(id, SchoolClassDto);
        return ResponseEntity.ok(updatedSchoolClass);
    }
}
