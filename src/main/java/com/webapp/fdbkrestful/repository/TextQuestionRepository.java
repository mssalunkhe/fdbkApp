package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.TextQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextQuestionRepository extends JpaRepository<TextQuestion, Integer> {
}
