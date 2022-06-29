package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> findAll();
    public Optional<Employee> findById(int id);
    public void save(Employee employee);
    public void deleteById(int id);
}
