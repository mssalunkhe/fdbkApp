package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.CoursesetDto;

import java.util.List;

public interface CoursesetService {
    public CoursesetDto createCourseset(CoursesetDto coursesetDto);

    public CoursesetDto addToCourseset(int setId, int courseId);

    public CoursesetDto getCoursesetByID(int id);

    public List<CoursesetDto> getAllCoursesets();

    public CoursesetDto updateCourseset(int id, CoursesetDto coursesetDto);

    public CoursesetDto deleteFromCourseset(int setId, int courseId);

    public CoursesetDto deleteCourseset(int id);
}
