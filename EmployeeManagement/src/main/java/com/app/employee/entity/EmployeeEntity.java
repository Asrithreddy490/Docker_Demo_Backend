package com.app.employee.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class EmployeeEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private double salary;
    private String attendance;
    private String password;

    // Getters and setters
}

