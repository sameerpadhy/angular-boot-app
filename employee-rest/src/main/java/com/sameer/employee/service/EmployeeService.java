package com.sameer.employee.service;

import com.sameer.employee.model.Employee;
import java.util.List;
public interface EmployeeService {

	Employee create(Employee employee);

	Employee delete(int id);

	List findAll();

	Employee findById(int id);

	Employee update(Employee employee);



}
