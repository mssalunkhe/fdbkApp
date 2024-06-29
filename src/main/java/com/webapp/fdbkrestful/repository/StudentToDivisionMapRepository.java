package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.StudentToDivisionMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentToDivisionMapRepository extends JpaRepository<StudentToDivisionMap, Integer> {
}
