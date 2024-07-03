package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.entity.Course;

public class CourseMapper {
    public static CourseDto mapToCourseDto(Course course) {
        return new CourseDto(course.getId(), course.getCode(), course.getAbbreviation(), course.getName(), course.getType(), course.getStatus(), course.getDescription(), course.getCourseSet());
    }

    public static Course mapToCourse(CourseDto courseDto) {
        return new Course(courseDto.getId(), courseDto.getCode(), courseDto.getAbbreviation(), courseDto.getName(), courseDto.getType(), courseDto.getStatus(), courseDto.getDescription(), courseDto.getCourseSet());
    }
}
