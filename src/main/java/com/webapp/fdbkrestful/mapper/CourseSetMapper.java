package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.CourseSetDto;
import com.webapp.fdbkrestful.entity.CourseSet;

public class CourseSetMapper {
    public static CourseSetDto mapToCourseSetDto(CourseSet courseSet) {
        return new CourseSetDto(courseSet.getId(), courseSet.getName(), courseSet.getAcademicYear(), courseSet.getSemester(), courseSet.getCourses());
        //return new CourseSetDto(courseSet.getId(),  courseSet.getName(), courseSet.getAcademicYear(), courseSet.getSemester());
    }

    public static CourseSet mapToCourseSet(CourseSetDto courseSetDto) {
        return new CourseSet(courseSetDto.getId(), courseSetDto.getName(), courseSetDto.getAcademicYear(), courseSetDto.getSemester(), courseSetDto.getCourses());
        //return new CourseSet(courseSetDto.getId(), courseSetDto.getName(), courseSetDto.getAcademicYear(), courseSetDto.getSemester());
    }
}
