package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer> {
}
