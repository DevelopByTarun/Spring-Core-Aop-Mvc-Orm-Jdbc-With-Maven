package com.app.service;

import org.springframework.stereotype.Service;
import com.app.dao.IEmployeeDAO;
import com.app.model.Employee;
import com.app.model.EmployeeLogin;

@Service
public class EmployeeService implements IEmployeeDAO {
	
	public EmployeeLogin authenticateEmployee(EmployeeLogin employeeLogin) {
		// TODO Auto-generated method stub
		EmployeeLogin emplogin = new EmployeeLogin();
		emplogin.setUsername(employeeLogin.getUsername());
		emplogin.setPassword(employeeLogin.getPassword());
		return emplogin;
	}

	public Employee addEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(employee.getId());
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setSalary(employee.getSalary());
		return emp;
	}
}
