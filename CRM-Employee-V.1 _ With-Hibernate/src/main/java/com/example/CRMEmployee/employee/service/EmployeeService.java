package com.example.CRMEmployee.employee.service;

import com.example.CRMEmployee.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    public Employee updateEmployee(Employee employee);

    Employee deleteById(Integer id);

    Integer deleteAll();

}
