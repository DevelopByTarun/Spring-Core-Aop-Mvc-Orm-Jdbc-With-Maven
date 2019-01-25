package com.app.dao;

import com.app.model.StudentDTO;
import com.app.model.StudentLoginDTO;

public interface IStudentDAO {
	
	public StudentLoginDTO authenticateStudent(StudentLoginDTO studentLogin) throws Exception;
	
	public StudentDTO addStudentDetails(StudentDTO student) throws Exception;
}
