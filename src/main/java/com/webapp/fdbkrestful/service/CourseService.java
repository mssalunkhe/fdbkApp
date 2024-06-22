package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.CourseDto;

import java.util.List;

public interface CourseService {
    public CourseDto createCourse(CourseDto courseDto);

    public CourseDto getCourseByID(int id);

    public List<CourseDto> getAllCourses();

    public CourseDto updateCourse(int id, CourseDto courseDto);

    public CourseDto deleteCourse(int id);
}
