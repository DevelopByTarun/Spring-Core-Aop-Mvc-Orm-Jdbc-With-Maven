package com.app.dao;

import com.app.model.Employee;
import com.app.model.EmployeeLogin;

public interface IEmployeeDAO {
	
	public EmployeeLogin authenticateEmployee(EmployeeLogin employeeLogin);
	
	public Employee addEmployeeDetails(Employee employee);
}
