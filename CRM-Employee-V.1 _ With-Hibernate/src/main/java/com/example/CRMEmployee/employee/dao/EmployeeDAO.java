package com.example.CRMEmployee.employee.dao;

import com.example.CRMEmployee.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();


    Employee delete(Employee employee);

    Integer deleteAll();
}
