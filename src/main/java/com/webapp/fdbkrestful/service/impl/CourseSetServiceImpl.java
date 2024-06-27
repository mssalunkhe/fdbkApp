package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.dto.CourseSetDto;
import com.webapp.fdbkrestful.entity.CourseSet;
import com.webapp.fdbkrestful.mapper.CourseMapper;
import com.webapp.fdbkrestful.mapper.CourseSetMapper;
import com.webapp.fdbkrestful.repository.CourseSetRepository;
import com.webapp.fdbkrestful.service.CourseSetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseSetServiceImpl implements CourseSetService {
    CourseSetRepository courseSetRepository;

    @Override
    public CourseSetDto createCourseSet(CourseSetDto courseSetDto) {
        CourseSet courseSet = CourseSetMapper.mapToCourseSet(courseSetDto);
        CourseSet createdCourseSet = courseSetRepository.save(courseSet);
        return CourseSetMapper.mapToCourseSetDto(createdCourseSet);
    }

    @Override
    public CourseSetDto addToCourseSet(int setId, int courseId) {
        return null;
    }

    @Override
    public CourseSetDto getCourseSetByID(int id) {
        CourseSet fetchedCourseSet = courseSetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return CourseSetMapper.mapToCourseSetDto(fetchedCourseSet);
    }

    @Override
    public List<CourseSetDto> getAllCourseSets() {

        return courseSetRepository.findAll().stream().map(CourseSetMapper::mapToCourseSetDto).toList();
    }

    @Override
    public CourseSetDto updateCourseSet(int id, CourseSetDto courseSetDto) {
        CourseSet fetchedCourseSet = courseSetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        //CourseSetDto courseSetDto= CourseSetMapper.mapToCourseSetDto(fetchedCourseSet);
        fetchedCourseSet.setName(courseSetDto.getName());
        Set<CourseDto> courses = courseSetDto.getCourses();
        fetchedCourseSet.setCourses(courses.stream().map(CourseMapper::mapToCourse).collect(Collectors.toSet()));
        courseSetRepository.save(fetchedCourseSet);
        return CourseSetMapper.mapToCourseSetDto(fetchedCourseSet);
    }

    @Override
    public CourseSetDto deleteFromCourseSet(int setId, int courseId) {
        return null;
    }

    @Override
    public CourseSetDto deleteCourseSet(int id) {
        CourseSet fetchedCourseSet = courseSetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        courseSetRepository.deleteById(id);
        return CourseSetMapper.mapToCourseSetDto(fetchedCourseSet);
    }
}
