package com.orgproject.solution1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.orgproject.solution1.model.Department;
import com.orgproject.solution1.service.DepartmentService;



@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")
    
    public String getAllDepartments() {
        return departmentService.getAllDepartments().toString();
    }

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
        return department;
    }

    @DeleteMapping("/{departmentId}")
    public void deleteDepartment(@PathVariable String departmentId) {
        departmentService.deleteDepartment(departmentId);
    }
}
