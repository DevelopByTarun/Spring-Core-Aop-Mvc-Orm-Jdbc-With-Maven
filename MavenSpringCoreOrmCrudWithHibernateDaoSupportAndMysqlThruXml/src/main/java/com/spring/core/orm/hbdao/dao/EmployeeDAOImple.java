package com.spring.core.orm.hbdao.dao;

import java.util.ArrayList;
import com.spring.core.orm.hbdao.dto.EmployeeDTO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDAOImple extends HibernateDaoSupport implements IEmployeeDAO {

	public void saveEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(employee);
	}

	public void updateEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(employee);
	}

	public void deleteEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(employee);
	}

	public EmployeeDTO getEmployeeById(int id) {
		// TODO Auto-generated method stub
		EmployeeDTO employeeDTO = getHibernateTemplate().get(EmployeeDTO.class, id);
		return employeeDTO;
	}

	public ArrayList<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
		employeeList = (ArrayList<EmployeeDTO>) getHibernateTemplate().loadAll(EmployeeDTO.class);
		return employeeList;
	}
}
