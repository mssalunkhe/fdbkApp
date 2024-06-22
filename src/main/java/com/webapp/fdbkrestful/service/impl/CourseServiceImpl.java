package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.entity.Course;
import com.webapp.fdbkrestful.mapper.CourseMapper;
import com.webapp.fdbkrestful.repository.CourseRepository;
import com.webapp.fdbkrestful.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepository;

    @Override
    public CourseDto createCourse(CourseDto courseDto) {
        Course course = CourseMapper.mapToCourse(courseDto);
        Course createdCourse = courseRepository.save(course);
        return CourseMapper.mapToCourseDto(createdCourse);
    }

    @Override
    public CourseDto getCourseByID(int id) {
        Course fetchedCourse = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return CourseMapper.mapToCourseDto(fetchedCourse);
    }

    @Override
    public List<CourseDto> getAllCourses() {

        return courseRepository.findAll().stream().map(CourseMapper::mapToCourseDto).toList();
    }

    @Override
    public CourseDto updateCourse(int id, CourseDto courseDto) {
        Course fetchedCourse = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedCourse.setName(courseDto.getName());
        fetchedCourse.setDescription(courseDto.getDescription());
        fetchedCourse.setAbbreviation(courseDto.getAbbreviation());
        fetchedCourse.setDescription(courseDto.getDescription());
        fetchedCourse.setCode(courseDto.getCode());
        fetchedCourse.setType(courseDto.getType());
        courseRepository.save(fetchedCourse);
        return CourseMapper.mapToCourseDto(fetchedCourse);
    }

    @Override
    public CourseDto deleteCourse(int id) {
        Course fetchedCourse = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        courseRepository.deleteById(id);
        return CourseMapper.mapToCourseDto(fetchedCourse);
    }
}
