package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
