package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Mcq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface McqRepository extends JpaRepository<Mcq, Integer> {
}
