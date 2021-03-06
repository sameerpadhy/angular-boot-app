import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Employee } from '../model/employee.model';
import { EmployeeService } from './employee.service';

@Component({
  templateUrl: './add-employee-component.html'

})
export class AddEmployeeComponent {

  employee: Employee = new Employee();

  constructor(private router: Router, private employeeService: EmployeeService) {

  }

  createEmployee(): void {
    this.employeeService.createEmployee(this.employee)
        .subscribe( data => {
          alert("Employee created successfully.");
        });

  };

}