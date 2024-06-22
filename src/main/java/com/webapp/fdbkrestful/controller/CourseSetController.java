package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.CourseSetDto;
import com.webapp.fdbkrestful.service.CourseSetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/courseset")
public class CourseSetController {
    private CourseSetService courseSetService;

    @PostMapping
    public ResponseEntity<CourseSetDto> createCourseSet(@RequestBody CourseSetDto courseSetDto) {
        CourseSetDto createdCourseSet = courseSetService.createCourseSet(courseSetDto);
        return new ResponseEntity<>(createdCourseSet, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<CourseSetDto> getCourseSetById(@PathVariable("id") int id) {
        CourseSetDto fetchedCourseSet = courseSetService.getCourseSetByID(id);
        return ResponseEntity.ok(fetchedCourseSet);
    }

    @GetMapping()
    public ResponseEntity<List<CourseSetDto>> getAllCourseSets() {
        List<CourseSetDto> fetchedCourseSets = courseSetService.getAllCourseSets();
        return ResponseEntity.ok(fetchedCourseSets);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CourseSetDto> deleteCourseSetById(@PathVariable("id") int id) {
        CourseSetDto deletedCourseSet = courseSetService.deleteCourseSet(id);
        return ResponseEntity.ok(deletedCourseSet);
    }

    @PutMapping("{id}")
    public ResponseEntity<CourseSetDto> updateCourseSet(@PathVariable("id") int id, @RequestBody CourseSetDto courseSetDto) {
        CourseSetDto updatedCourseSet = courseSetService.updateCourseSet(id, courseSetDto);
        return ResponseEntity.ok(updatedCourseSet);
    }
}
