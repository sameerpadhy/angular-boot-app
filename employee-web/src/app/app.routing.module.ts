import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { Employeeomponent } from './employee/employee.component';
import {AddEmployeeComponent} from './employee/add-employee-component';


const routes: Routes = [
  { path: 'employees', component: Employeeomponent },
  { path: 'add', component: AddEmployeeComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }