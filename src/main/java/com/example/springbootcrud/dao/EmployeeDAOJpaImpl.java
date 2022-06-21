package com.example.springbootcrud.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class EmployeeDAOJpaImpl implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
