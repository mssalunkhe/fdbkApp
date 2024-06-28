package com.webapp.fdbkrestful.repository;

import com.webapp.fdbkrestful.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
