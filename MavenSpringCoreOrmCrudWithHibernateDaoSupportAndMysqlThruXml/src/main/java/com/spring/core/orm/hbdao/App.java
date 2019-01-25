package com.spring.core.orm.hbdao;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.orm.hbdao.dto.EmployeeDTO;
import com.spring.core.orm.hbdao.dao.IEmployeeDAO;

public class App 
{
    @SuppressWarnings({ "unused", "resource" })
	public static void main( String[] args ) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployeeDAO dao = (IEmployeeDAO) ac.getBean("employeeDaoImpleObj");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Add Employee");
    		System.out.println("2. Update Employee");
    		System.out.println("3. Delete Employee");
    		System.out.println("4. Fetch All Employee");
    		System.out.println("5. Fetch Employee By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Employee Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Employee City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Employee Salary :: ");
    			double salary = sc.nextDouble();
    			
    			EmployeeDTO addEmp = new EmployeeDTO();
    			addEmp.setName(name);
    			addEmp.setCity(city);
    			addEmp.setSalary(salary);
    			dao.saveEmployee(addEmp);
    			if(addEmp != null) {
    				System.out.println("Employee Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Employee");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Employee Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Employee City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Employee Salary :: ");
    			double salary = sc.nextDouble();
    			
    			System.out.print("Enter Employee Id Want To Update :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO updateEmp = new EmployeeDTO();
    			updateEmp.setName(name);
    			updateEmp.setCity(city);
    			updateEmp.setSalary(salary);
    			updateEmp.setId(id);
    			dao.updateEmployee(updateEmp);
    			if(updateEmp != null) {
    				System.out.println("Employee Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Employee");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Employee Id Want To Delete :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO deleteEmp = new EmployeeDTO();
    			deleteEmp.setId(id);
    			dao.deleteEmployee(deleteEmp);
    			if(deleteEmp != null) {
    				System.out.println("Employee Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Employee");
    			}
    		}
    		else if(choice == 4) {
    			ArrayList<EmployeeDTO> employeeList = dao.getAllEmployees();
    			for(EmployeeDTO emps : employeeList) {
    				System.out.println("Employee Id Is :: "+emps.getId());
    				System.out.println("Employee Name Is :: "+emps.getName());
    				System.out.println("Employee City Is :: "+emps.getCity());
    				System.out.println("Employee Salary Is :: "+emps.getSalary());
    				System.out.println("");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Employee Id Want To Fetch Record :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO searchEmp = dao.getEmployeeById(id);
    			if(searchEmp != null) {
    				System.out.println(searchEmp);
    			}
    			else {
    				System.out.println("Unable To Search Employee");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
