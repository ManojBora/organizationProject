package com.orgproject.solution1.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orgproject.solution1.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	List<Employee> findByDepartmentId(String departmentId);
   
}