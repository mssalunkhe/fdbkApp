package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
