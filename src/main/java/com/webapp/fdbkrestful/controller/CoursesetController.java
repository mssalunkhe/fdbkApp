package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.CoursesetDto;
import com.webapp.fdbkrestful.entity.Courseset;
import com.webapp.fdbkrestful.service.CoursesetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/courseset")
public class CoursesetController {
    private CoursesetService coursesetService;

    @PostMapping
    public ResponseEntity<CoursesetDto> createCourseset(@RequestBody CoursesetDto coursesetDto) {
        CoursesetDto createdCourseset = coursesetService.createCourseset(coursesetDto);
        return new ResponseEntity<>(createdCourseset, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<CoursesetDto> getCoursesetById(@PathVariable("id") int id) {
        CoursesetDto fetchedCourseset = coursesetService.getCoursesetByID(id);
        return ResponseEntity.ok(fetchedCourseset);
    }

    @GetMapping()
    public ResponseEntity<List<CoursesetDto>> getAllCoursesets() {
        List<CoursesetDto> fetchedCoursesets = coursesetService.getAllCoursesets();
        return ResponseEntity.ok(fetchedCoursesets);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CoursesetDto> deleteCoursesetById(@PathVariable("id") int id) {
        CoursesetDto deletedCourseset = coursesetService.deleteCourseset(id);
        return ResponseEntity.ok(deletedCourseset);
    }

    @PutMapping("{id}")
    public ResponseEntity<CoursesetDto> updateCourseset(@PathVariable("id") int id, @RequestBody CoursesetDto coursesetDto) {
        CoursesetDto updatedCourseset = coursesetService.updateCourseset(id, coursesetDto);
        return ResponseEntity.ok(updatedCourseset);
    }
}
