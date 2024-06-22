package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.CourseSetDto;

import java.util.List;

public interface CourseSetService {
    public CourseSetDto createCourseSet(CourseSetDto courseSetDto);

    public CourseSetDto addToCourseSet(int setId, int courseId);

    public CourseSetDto getCourseSetByID(int id);

    public List<CourseSetDto> getAllCourseSets();

    public CourseSetDto updateCourseSet(int id, CourseSetDto courseSetDto);

    public CourseSetDto deleteFromCourseSet(int setId, int courseId);

    public CourseSetDto deleteCourseSet(int id);
}
