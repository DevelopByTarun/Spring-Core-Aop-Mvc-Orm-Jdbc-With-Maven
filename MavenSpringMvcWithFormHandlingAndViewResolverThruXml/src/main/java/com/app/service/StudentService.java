package com.app.service;

import org.springframework.stereotype.Service;
import com.app.dao.IStudentDAO;
import com.app.model.StudentDTO;
import com.app.model.StudentLoginDTO;

@Service
public class StudentService implements IStudentDAO  {

	public StudentLoginDTO authenticateStudent(StudentLoginDTO studentLogin) throws Exception {
		// TODO Auto-generated method stub
		if(studentLogin.getUsername().equals("tarun") && studentLogin.getPassword().equals("parve")) {
			return studentLogin;
		}
		else {
			return null;
		}
	}

	public StudentDTO addStudentDetails(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO stud = new StudentDTO();
		stud.setId(student.getId());
		stud.setName(student.getName());
		stud.setAge(student.getAge());
		stud.setState(student.getState());
		stud.setCountry(student.getCountry());
		return stud;
	}
}
