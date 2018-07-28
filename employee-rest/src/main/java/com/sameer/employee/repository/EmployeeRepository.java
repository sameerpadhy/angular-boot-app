package com.sameer.employee.repository;
import org.springframework.data.repository.Repository;
import com.sameer.employee.model.Employee;
import java.util.List;

public interface EmployeeRepository extends Repository<Employee, String>{

	void delete(Employee employee);

    List<Employee> findAll();

   // Employee findOne(int id);
    
    Employee findById(int id);

    Employee save(Employee user);
}
