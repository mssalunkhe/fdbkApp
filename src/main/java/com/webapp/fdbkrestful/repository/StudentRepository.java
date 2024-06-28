package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
