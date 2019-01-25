package com.spring.core.orm.hbdao.dao;

import java.util.ArrayList;
import com.spring.core.orm.hbdao.dto.EmployeeDTO;

public interface IEmployeeDAO {
	
	public void saveEmployee(EmployeeDTO employee);
	
	public void updateEmployee(EmployeeDTO employee);
	
	public void deleteEmployee(EmployeeDTO employee);
	
	public EmployeeDTO getEmployeeById(int id);
	
	public ArrayList<EmployeeDTO> getAllEmployees();
}
