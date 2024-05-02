package com.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.entity.EmployeeEntity;
import com.app.employee.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeRepository;
    
//    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable String id) {
        return employeeRepository.getEmployeeById(id);
    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeRepository.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable String id, @RequestBody EmployeeEntity employee) {
        
            
            
        return employeeRepository.updateEmployee(id, employee); 
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeRepository.deleteEmployee(id);
    }
}