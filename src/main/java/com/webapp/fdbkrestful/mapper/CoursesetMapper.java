package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.CoursesetDto;
import com.webapp.fdbkrestful.entity.Courseset;

import java.util.stream.Collectors;

public class CoursesetMapper {
    public static CoursesetDto mapToCoursesetDto(Courseset courseset) {
        return new CoursesetDto(courseset.getId(), courseset.getName(), courseset.getCourses()==null?null:courseset.getCourses().stream().map(CourseMapper::mapToCourseDto).collect(Collectors.toSet()), courseset.getStatus(), courseset.getDescription());
        //return new CoursesetDto(courseset.getId(),  courseset.getName(), courseset.getAcademicYear(), courseset.getSemester());
    }

    public static Courseset mapToCourseset(CoursesetDto coursesetDto) {
        return new Courseset(coursesetDto.getId(), coursesetDto.getName(), coursesetDto.getCourses()==null?null:coursesetDto.getCourses().stream().map(CourseMapper::mapToCourse).collect(Collectors.toSet()), coursesetDto.getStatus(), coursesetDto.getDescription());
        //return new Courseset(coursesetDto.getId(), coursesetDto.getName(), coursesetDto.getAcademicYear(), coursesetDto.getSemester());
    }
}
