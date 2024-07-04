package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
