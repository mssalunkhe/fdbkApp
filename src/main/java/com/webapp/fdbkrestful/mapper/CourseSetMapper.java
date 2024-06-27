package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.CourseSetDto;
import com.webapp.fdbkrestful.entity.CourseSet;

import java.util.stream.Collectors;

public class CourseSetMapper {
    public static CourseSetDto mapToCourseSetDto(CourseSet courseSet) {
        return new CourseSetDto(courseSet.getId(), courseSet.getName(), courseSet.getCourses().stream().map(CourseMapper::mapToCourseDto).collect(Collectors.toSet()), courseSet.getStatus(), courseSet.getDescription());
        //return new CourseSetDto(courseSet.getId(),  courseSet.getName(), courseSet.getAcademicYear(), courseSet.getSemester());
    }

    public static CourseSet mapToCourseSet(CourseSetDto courseSetDto) {
        return new CourseSet(courseSetDto.getId(), courseSetDto.getName(), courseSetDto.getCourses().stream().map(CourseMapper::mapToCourse).collect(Collectors.toSet()), courseSetDto.getStatus(), courseSetDto.getDescription());
        //return new CourseSet(courseSetDto.getId(), courseSetDto.getName(), courseSetDto.getAcademicYear(), courseSetDto.getSemester());
    }
}
