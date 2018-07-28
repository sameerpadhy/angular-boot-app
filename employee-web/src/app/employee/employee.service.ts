import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Employee } from '../model/employee.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {

  constructor(private http:HttpClient) {}

  //private userUrl = 'http://localhost:8080/user-portal/user';
	private employeeUrl = 'http://localhost:8080/api';

  public getEmployees() {
    return this.http.get<Employee[]>(this.employeeUrl);
  }

  public deleteEmployee(employee) {
    return this.http.delete(this.employeeUrl + "/"+ employee.id);
  }

  public createEmployee(employee) {
    return this.http.post<Employee>(this.employeeUrl, employee);
  }

}