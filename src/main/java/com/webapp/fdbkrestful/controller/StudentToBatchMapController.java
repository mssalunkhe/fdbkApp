package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.StudentToBatchMapDto;
import com.webapp.fdbkrestful.service.StudentToBatchMapService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/studentToBatchMap")
public class StudentToBatchMapController {
    private StudentToBatchMapService studentToBatchMapService;

    @PostMapping
    public ResponseEntity<StudentToBatchMapDto> createStudentToBatchMap(@RequestBody StudentToBatchMapDto studentToBatchMapDto) {
        StudentToBatchMapDto createdStudentToBatchMap = studentToBatchMapService.createStudentToBatchMap(studentToBatchMapDto);
        return new ResponseEntity<>(createdStudentToBatchMap, HttpStatus.CREATED);
    }

    /*@GetMapping("{id}")
    public ResponseEntity<StudentToBatchMapDto> getStudentToBatchMapById(@PathVariable("id") int id) {
        StudentToBatchMapDto fetchedStudentToBatchMap = studentToBatchMapService.getStudentToBatchMapByID(id);
        return ResponseEntity.ok(fetchedStudentToBatchMap);
    }*/

    @GetMapping()
    public ResponseEntity<List<StudentToBatchMapDto>> getAllStudentToBatchMapes() {
        List<StudentToBatchMapDto> fetchedStudentToBatchMaps = studentToBatchMapService.getAllStudentToBatchMaps();
        return ResponseEntity.ok(fetchedStudentToBatchMaps);
    }

    /*@DeleteMapping("{id}")
    public ResponseEntity<StudentToBatchMapDto> deleteStudentToBatchMapById(@PathVariable("id") int id) {
        StudentToBatchMapDto deletedStudentToBatchMap = studentToBatchMapService.deleteStudentToBatchMap(id);
        return ResponseEntity.ok(deletedStudentToBatchMap);
    }*/

    /*@PutMapping("{id}")
    public ResponseEntity<StudentToBatchMapDto> updateStudentToBatchMap(@PathVariable("id") int id, @RequestBody StudentToBatchMapDto studentToBatchMapDto) {
        StudentToBatchMapDto updatedStudentToBatchMap = studentToBatchMapService.updateStudentToBatchMap(id, studentToBatchMapDto);
        return ResponseEntity.ok(updatedStudentToBatchMap);
    }*/
}
