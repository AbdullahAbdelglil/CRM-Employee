package com.example.CRMEmployee.employee.service;

import com.example.CRMEmployee.employee.dao.EmployeeDAO;
import com.example.CRMEmployee.employee.entity.Employee;
import com.example.CRMEmployee.employee.exceptionhandling.exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImplementation(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {

        employee.setId(0);

        return employeeDAO.save(employee);
    }

    @Override
    public Employee findById(Integer id) {

        Employee dbEmployee = employeeDAO.findById(id);

        if(dbEmployee==null) {
            throw new EmployeeNotFoundException("Employee id not found - "+id);
        }
        else {
            return dbEmployee;
        }

    }

    @Override
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }

    @Transactional
    @Override
    public Employee updateEmployee(Employee employee) {

        Employee dbEmployee;

        dbEmployee = employeeDAO.save(employee);

        return dbEmployee;
    }

    @Transactional
    @Override
    public Employee deleteById(Integer id) {

        Employee dbEmployee = findById(id);

        return employeeDAO.delete(dbEmployee);
    }

    @Transactional
    @Override
    public Integer deleteAll() {

        return employeeDAO.deleteAll();
    }

}
