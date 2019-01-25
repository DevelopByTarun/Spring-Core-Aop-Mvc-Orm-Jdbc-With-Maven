package com.app.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.customException.CustomEmployeeException;
import com.app.dao.IEmployeeDAO;
import com.app.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeDAO iemployee;
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView getEmployeeDetails(@RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("age") int age,
			@RequestParam("salary") double salary, @ModelAttribute() Employee employee) {
		Employee emps = null;
		ModelAndView model = new ModelAndView();
		if(id < 2) {
			throw new CustomEmployeeException(new Date(), "Unable To Add Id !! Try Again Dude :-(");
		}
		else {
			employee.setId(id);
		}
		if(name.length() > 8) {
			throw new CustomEmployeeException(new Date(), "Unable To Add Name !! Try Again Dude :-(");
		}
		else {
			employee.setName(name);
		}
		if(age < 25) {
			throw new CustomEmployeeException(new Date(), "Unable To Add Age !! Try Again Dude :-(");
		}
		else {
			employee.setAge(age);
		}
		if(salary > 108756.23) {
			throw new CustomEmployeeException(new Date(), "Unable To Add Salary !! Try Again Dude :-(");
		}
		else {
			employee.setSalary(salary);
		}
		emps = iemployee.addEmployeeDetails(employee);
		model.addObject("details", emps);
		model.setViewName("employeeDetail");
		return model;	
	}	
}
