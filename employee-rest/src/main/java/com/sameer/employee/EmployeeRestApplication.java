package com.sameer.employee;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sameer.employee.model.Employee;
import com.sameer.employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeRestApplication {
	
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApplication.class, args);
	}

	
}
