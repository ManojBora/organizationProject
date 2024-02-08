package com.orgproject.solution1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orgproject.solution1.dao.DepartmentRepository;
import com.orgproject.solution1.model.Department;


@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    
    @Transactional
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(String departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
