package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.dto.CoursesetDto;
import com.webapp.fdbkrestful.entity.Courseset;
import com.webapp.fdbkrestful.mapper.CourseMapper;
import com.webapp.fdbkrestful.mapper.CoursesetMapper;
import com.webapp.fdbkrestful.repository.CoursesetRepository;
import com.webapp.fdbkrestful.service.CoursesetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CoursesetServiceImpl implements CoursesetService {
    CoursesetRepository coursesetRepository;

    @Override
    public CoursesetDto createCourseset(CoursesetDto coursesetDto) {
        Courseset courseset = CoursesetMapper.mapToCourseset(coursesetDto);
        Courseset createdCourseset = coursesetRepository.save(courseset);
        return CoursesetMapper.mapToCoursesetDto(createdCourseset);
    }

    @Override
    public CoursesetDto addToCourseset(int setId, int courseId) {
        return null;
    }

    @Override
    public CoursesetDto getCoursesetByID(int id) {
        Courseset fetchedCourseset = coursesetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return CoursesetMapper.mapToCoursesetDto(fetchedCourseset);
    }

    @Override
    public List<CoursesetDto> getAllCoursesets() {

        return coursesetRepository.findAll().stream().map(CoursesetMapper::mapToCoursesetDto).toList();
    }

    @Override
    public CoursesetDto updateCourseset(int id, CoursesetDto coursesetDto) {
        Courseset fetchedCourseset = coursesetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        //CoursesetDto coursesetDto= CoursesetMapper.mapToCoursesetDto(fetchedCourseset);
        fetchedCourseset.setName(coursesetDto.getName());
        Set<CourseDto> courses = coursesetDto.getCourses();
        fetchedCourseset.setCourses(courses.stream().map(CourseMapper::mapToCourse).collect(Collectors.toSet()));
        coursesetRepository.save(fetchedCourseset);
        return CoursesetMapper.mapToCoursesetDto(fetchedCourseset);
    }

    @Override
    public CoursesetDto deleteFromCourseset(int setId, int courseId) {
        return null;
    }

    @Override
    public CoursesetDto deleteCourseset(int id) {
        Courseset fetchedCourseset = coursesetRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        coursesetRepository.deleteById(id);
        return CoursesetMapper.mapToCoursesetDto(fetchedCourseset);
    }
}
