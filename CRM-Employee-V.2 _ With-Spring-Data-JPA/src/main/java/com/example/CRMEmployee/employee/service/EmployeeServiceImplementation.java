package com.example.CRMEmployee.employee.service;

import com.example.CRMEmployee.employee.entity.Employee;
import com.example.CRMEmployee.employee.exceptionhandling.exceptions.EmployeeNotFoundException;
import com.example.CRMEmployee.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {

        employee.setId(0);

        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {

        Optional<Employee> employee = employeeRepository.findById(id);

        Employee dbEmployee;

        if (employee.isPresent()) {
            dbEmployee = employee.get();
        } else {
            throw new EmployeeNotFoundException("Employee id not found - " + id);
        }

        return dbEmployee;
    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        Employee dbEmployee;

        dbEmployee = employeeRepository.save(employee);

        return dbEmployee;
    }

    @Override
    public Employee deleteById(Integer id) {

        Employee dbEmployee = findById(id);

        employeeRepository.deleteById(id);

        return dbEmployee;
    }

    @Override
    public void deleteAll() {

        employeeRepository.deleteAll();
    }

}
