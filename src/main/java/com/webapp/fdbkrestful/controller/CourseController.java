package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/course")
public class CourseController {
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto) {
        CourseDto createdCourse = courseService.createCourse(courseDto);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("id") int id) {
        CourseDto fetchedCourse = courseService.getCourseByID(id);
        return ResponseEntity.ok(fetchedCourse);
    }

    @GetMapping()
    public ResponseEntity<List<CourseDto>> getAllCoursees() {
        List<CourseDto> fetchedCourses = courseService.getAllCourses();
        return ResponseEntity.ok(fetchedCourses);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CourseDto> deleteCourseById(@PathVariable("id") int id) {
        CourseDto deletedCourse = courseService.deleteCourse(id);
        return ResponseEntity.ok(deletedCourse);
    }

    @PutMapping("{id}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable("id") int id, @RequestBody CourseDto courseDto) {
        CourseDto updatedCourse = courseService.updateCourse(id, courseDto);
        return ResponseEntity.ok(updatedCourse);
    }
}
