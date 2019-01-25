package com.app.dao;

import java.util.List;
import com.app.model.StudentDTO;

public interface IStudentDAO {
	
	public int saveStudent(StudentDTO studentDTO) throws Exception;
	
	public int updateStudent(StudentDTO studentDTO) throws Exception;
	
	public int deleteStudent(int id) throws Exception;
	
	public StudentDTO getStudentById(int id) throws Exception;
	
	public List<StudentDTO> getAllStudents() throws Exception;
}
