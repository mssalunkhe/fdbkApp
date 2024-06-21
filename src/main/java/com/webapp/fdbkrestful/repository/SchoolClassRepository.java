package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Integer> {
}
