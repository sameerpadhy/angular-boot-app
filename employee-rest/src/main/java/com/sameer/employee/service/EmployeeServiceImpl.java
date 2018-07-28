package com.sameer.employee.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sameer.employee.model.Employee;
import com.sameer.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository repository;
	
	@PostConstruct
	public void run() throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Employee("1","Sameer","Padhy","sa@abc.com"));
		
	}
	/* (non-Javadoc)
	 * @see com.sameer.employee.service.EmployeeService1#create(com.sameer.employee.model.Employee)
	 */
	@Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    /* (non-Javadoc)
	 * @see com.sameer.employee.service.EmployeeService1#delete(int)
	 */
    @Override
    public Employee delete(int id) {
        Employee employee = findById(id);
        if(employee != null){
            repository.delete(employee);
        }
        return employee;
    }

    @Override
	public List findAll() {
        return repository.findAll();
    }

    /* (non-Javadoc)
	 * @see com.sameer.employee.service.EmployeeService1#findById(int)
	 */
    @Override
    public Employee findById(int id) {
        return repository.findById(id);
    	//return null;
    }

    /* (non-Javadoc)
	 * @see com.sameer.employee.service.EmployeeService1#update(com.sameer.employee.model.Employee)
	 */
    @Override
    public Employee update(Employee employee) {
        return null;
    }
}
