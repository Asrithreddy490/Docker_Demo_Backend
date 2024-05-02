package com.app.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.employee.entity.EmployeeEntity;

@Service
public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity getEmployeeById(String id);
    EmployeeEntity createEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(String id, EmployeeEntity employee);
    void deleteEmployee(String id);
    
}