package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.StudentToBatchMap;
import com.webapp.fdbkrestful.entity.StudentToBatchMapCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface


StudentToBatchMapRepository extends JpaRepository<StudentToBatchMap, StudentToBatchMapCompositeKey> {
}
