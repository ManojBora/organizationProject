package com.orgproject.solution1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orgproject.solution1.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}