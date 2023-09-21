package com.example.CRMEmployee.employee.dao;

import com.example.CRMEmployee.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Employee save(Employee employee) {

       return entityManager.merge(employee);
    }

    @Override
    public Employee findById(Integer id) {

        return entityManager.find(Employee.class,id);
    }

    TypedQuery<Employee> query;

    @Override
    public List<Employee> findAll() {

        query= entityManager.createQuery("FROM Employee",Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee delete(Employee employee) {


        entityManager.remove(employee);

        return employee;
    }

    @Override
    public Integer deleteAll() {

        return entityManager.createQuery("DELETE FROM Employee").executeUpdate();
    }
}
