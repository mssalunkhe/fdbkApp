package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Integer> {
}
