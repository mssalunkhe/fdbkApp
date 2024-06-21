package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
