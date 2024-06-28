package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
