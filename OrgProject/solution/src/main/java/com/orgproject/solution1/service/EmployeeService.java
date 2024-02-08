package com.orgproject.solution1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orgproject.solution1.dao.EmployeeRepository;
import com.orgproject.solution1.model.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesByDepartmentId(String departmentId) {
       return employeeRepository.findByDepartmentId(departmentId);
    }
    
    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void updateEmployee(Employee employee) {
        
        employeeRepository.save(employee);
    }
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }

	public Object getEmployeesById(String employeeId) {
		return employeeRepository.findById(employeeId);
	}

}

