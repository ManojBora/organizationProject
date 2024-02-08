package com.orgproject.solution1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.orgproject.solution1.model.Employee;
import com.orgproject.solution1.service.EmployeeService;


@RestController
@RequestMapping("employees")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    public String getAllEmployees() {
    	System.out.println(employeeService.getAllEmployees());
        return employeeService.getAllEmployees().toString();
        
    }

    @GetMapping("/department/{departmentId}")
    public String getEmployeesByDepartmentId(@PathVariable String departmentId) {
        return employeeService.getEmployeesByDepartmentId(departmentId).toString();
        
   }
    
    @GetMapping("/{employeeId}")
    public String getEmployeesByEmployeeId(@PathVariable String employeeId) {
        return employeeService.getEmployeesById(employeeId).toString();
        
   }
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/employees/";
    }
}
