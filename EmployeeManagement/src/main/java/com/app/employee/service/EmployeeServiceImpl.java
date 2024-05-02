package com.app.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.entity.EmployeeEntity;
import com.app.employee.repo.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(String id, EmployeeEntity employee) {
        Optional<EmployeeEntity> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            EmployeeEntity emp = existingEmployee.get();
            emp.setName(employee.getName());
            emp.setEmail(employee.getEmail());
            emp.setSalary(employee.getSalary());
            emp.setAttendance(employee.getAttendance());
            emp.setPassword(employee.getPassword()); // Update the password
            employeeRepository.save(emp);
            return emp; // Return the updated employee entity
        }
        return null; // Or handle the case where the employee with the given id is not found
    }

    	
        
        
//        if (existingEmployee != null) {
//            existingEmployee.setName(employee.getName());
//            existingEmployee.setEmail(employee.getEmail());
//            existingEmployee.setSalary(employee.getSalary());
//            existingEmployee.setAttendance(employee.getAttendance());
//            existingEmployee.setPassword(employee.getPassword());
//            return employeeRepository.save(existingEmployee);
//        }
//    	return employeeRepository.save(employee);
//    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

	

   
}