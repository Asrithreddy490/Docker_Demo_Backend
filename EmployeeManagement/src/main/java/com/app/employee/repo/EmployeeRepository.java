package com.app.employee.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.employee.entity.EmployeeEntity;

@Repository

public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {


}