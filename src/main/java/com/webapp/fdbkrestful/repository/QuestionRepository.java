package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
