package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.dto.CourseDto;
import com.webapp.fdbkrestful.dto.StaffDto;
import com.webapp.fdbkrestful.dto.StudentDto;
import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.entity.Course;
import com.webapp.fdbkrestful.entity.Staff;
import com.webapp.fdbkrestful.entity.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BatchMapper {
    public static BatchDto mapToBatchDto(Batch batch){

        Set<Student> students=batch.getStudents();
        Set<StudentDto> studentsDto;

        studentsDto=students.stream().map(StudentMapper::mapToStudentDto).collect(Collectors.toSet());

        Map<Course, Staff> courseStaffMap;
        Map<CourseDto, StaffDto> courseDtoStaffDtoMap=new HashMap<>();
        courseStaffMap=batch.getCourseInstructors();
        courseStaffMap.keySet().forEach(key->courseDtoStaffDtoMap.put(
                CourseMapper.mapToCourseDto(key),StaffMapper.mapToStaffDto(courseStaffMap.get(key))));


        return new BatchDto(batch.getId(), batch.getName(), batch.getStatus(), batch.getDescription(),
                batch.getAcademicYear(), batch.getSemester(),DivisionMapper.mapToDivisionDto(batch.getDivision()),CoursesetMapper.mapToCoursesetDto(batch.getCourseset())
                , courseDtoStaffDtoMap,studentsDto);
    }
    public static Batch mapToBatch(BatchDto batchDto){
        Set<StudentDto> studentsDto=batchDto.getStudentsDto();
        Set<Student> students;

        students=studentsDto.stream().map(StudentMapper::mapToStudent).collect(Collectors.toSet());

        Map<Course, Staff> courseStaffMap=new HashMap<>();
        Map<CourseDto, StaffDto> courseDtoStaffDtoMap;
        courseDtoStaffDtoMap=batchDto.getCourseInstructorsDto();
        courseDtoStaffDtoMap.keySet().forEach(key->courseStaffMap.put(
                CourseMapper.mapToCourse(key),StaffMapper.mapToStaff(courseDtoStaffDtoMap.get(key))));

        return new Batch(batchDto.getId(), batchDto.getName(), batchDto.getStatus(), batchDto.getDescription(), batchDto.getAcademicYear(), batchDto.getSemester(),DivisionMapper.mapToDivision(batchDto.getDivisionDto()),
                CoursesetMapper.mapToCourseset(batchDto.getCoursesetDto()),courseStaffMap,students);
    }
}
