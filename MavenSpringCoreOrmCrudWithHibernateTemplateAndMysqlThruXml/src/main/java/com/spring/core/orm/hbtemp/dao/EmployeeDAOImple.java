package com.spring.core.orm.hbtemp.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.spring.core.orm.hbtemp.dto.EmployeeDTO;

public class EmployeeDAOImple implements IEmployeeDAO {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void saveEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(employee);
	}

	public void updateEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
	}

	public void deleteEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
	}

	public EmployeeDTO getEmployeeById(int id) {
		// TODO Auto-generated method stub
		EmployeeDTO employeeDTO = hibernateTemplate.get(EmployeeDTO.class, id);
		return employeeDTO;
	}

	public ArrayList<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
		employeeList = (ArrayList<EmployeeDTO>) hibernateTemplate.loadAll(EmployeeDTO.class);
		return employeeList;
	}
}
