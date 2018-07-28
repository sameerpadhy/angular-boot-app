import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Employee } from '../model/employee.model';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-emp',
  templateUrl: './employee.component.html',
  styles: []
})
export class Employeeomponent implements OnInit {

  employees: Employee[];

  constructor(private router: Router, private employeeService: EmployeeService) {

  }

  ngOnInit() {
    this.employeeService.getEmployees()
      .subscribe( data => {
      //employees: Employee[];
        this.employees = data;
      });
  };

  deleteEmployee(employee: Employee): void {
    this.employeeService.deleteEmployee(employee)
      .subscribe( data => {
        this.employees = this.employees.filter(e => e !== employee);
      })
  };

}
