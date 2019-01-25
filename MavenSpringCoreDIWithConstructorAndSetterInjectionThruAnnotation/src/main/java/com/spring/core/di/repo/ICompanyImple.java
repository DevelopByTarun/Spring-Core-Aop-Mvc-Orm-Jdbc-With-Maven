package com.spring.core.di.repo;

import javax.inject.Inject;
import org.springframework.stereotype.Repository;
import com.spring.core.di.bean.EmployeeBean;

@Repository(value = "companyRepository")
public class ICompanyImple implements ICompany {
	
	@Inject
	private EmployeeBean employee;
	
	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.employee.getId());
		System.out.println("Employee Name Is :: "+this.employee.getName());
	}

	public void getEmployeeWithAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.employee.getId());
		System.out.println("Employee Name Is :: "+this.employee.getName());
		System.out.println("Employee City Is :: "+this.employee.getAddressBean().getCity());
		System.out.println("Employee Pincode Is :: "+this.employee.getAddressBean().getPincode());
	}
}
