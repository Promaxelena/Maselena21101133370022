package com.javaguides.springbootrestfulcrudapp.repository;

import com.javaguides.springbootrestfulcrudapp.model.Compliance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceRepository extends JpaRepository<Compliance, Long> {
}
