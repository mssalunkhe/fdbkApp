package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {
}
