package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.DivisionDto;
import com.webapp.fdbkrestful.service.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/division")
public class DivisionController {
    private DivisionService DivisionService;

    @PostMapping
    public ResponseEntity<DivisionDto> createDivision(@RequestBody DivisionDto DivisionDto) {
        DivisionDto createdDivision = DivisionService.createDivision(DivisionDto);
        return new ResponseEntity<>(createdDivision, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DivisionDto> getDivisionById(@PathVariable("id") int id) {
        DivisionDto fetchedDivision = DivisionService.getDivisionByID(id);
        return ResponseEntity.ok(fetchedDivision);
    }

    @GetMapping()
    public ResponseEntity<List<DivisionDto>> getAllDivisions() {
        List<DivisionDto> fetchedDivisiones = DivisionService.getAllDivisions();
        return ResponseEntity.ok(fetchedDivisiones);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DivisionDto> deleteDivisionById(@PathVariable("id") int id) {
        DivisionDto deletedDivision = DivisionService.deleteDivision(id);
        return ResponseEntity.ok(deletedDivision);
    }

    @PutMapping("{id}")
    public ResponseEntity<DivisionDto> updateDivision(@PathVariable("id") int id, @RequestBody DivisionDto DivisionDto) {
        DivisionDto updatedDivision = DivisionService.updateDivision(id, DivisionDto);
        return ResponseEntity.ok(updatedDivision);
    }
}
