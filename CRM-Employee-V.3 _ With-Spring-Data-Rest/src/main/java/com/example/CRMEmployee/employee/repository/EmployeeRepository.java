package com.example.CRMEmployee.employee.repository;

import com.example.CRMEmployee.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
