package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Integer> {
}
