package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
}
