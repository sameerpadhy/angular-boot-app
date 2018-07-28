package com.sameer.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameer.employee.model.Employee;
import com.sameer.employee.service.EmployeeService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping(path = {"/{id}"})
    public Employee findOne(@PathVariable("id") int id){
        return employeeService.findById(id);
    }

    @PutMapping
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping(path ={"/{id}"})
    public Employee delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    }

    @GetMapping
    public List findAll(){
        return employeeService.findAll();
    }
}
