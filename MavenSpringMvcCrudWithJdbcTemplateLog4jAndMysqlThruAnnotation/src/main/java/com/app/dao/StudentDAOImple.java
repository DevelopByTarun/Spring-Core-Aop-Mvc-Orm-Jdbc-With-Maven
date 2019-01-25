package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import com.app.model.StudentDTO;
import com.app.util.StudentMapper;

@Repository
public class StudentDAOImple implements IStudentDAO, QueryInterface {

	private JdbcTemplate jdbcTemplate;
	
	public StudentDAOImple(DataSource datasource) {
		// TODO Auto-generated constructor stub
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	public int saveStudent(StudentDTO studentDTO) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(INSERT_STUDENT_QUERY, new Object[] {
				studentDTO.getId(),
				studentDTO.getName(),
				studentDTO.getAge(),
				studentDTO.getCity()
		});
	}

	public int updateStudent(StudentDTO studentDTO) throws Exception {
		// TODO Auto-generated method stub
		 String query = "update studentMvc set name='"+studentDTO.getName()+"', age="+studentDTO.getAge()+", city='"+studentDTO.getCity()+"' where id="+studentDTO.getId()+"";  
		return jdbcTemplate.update(query);
	}

	public int deleteStudent(int id) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(DELETE_STUDENT_QUERY, new Object[] {
				id
		});
	}

	public StudentDTO getStudentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return (StudentDTO) jdbcTemplate.queryForObject(SELECTBYID_STUDENT_QUERY, new Object[] {
				id
		}, new StudentMapper());
	}

	@SuppressWarnings("unchecked")
	public List<StudentDTO> getAllStudents() throws Exception {
		// TODO Auto-generated method stub
		List<StudentDTO> studentList = (List<StudentDTO>) jdbcTemplate.query(SELECT_STUDENT_QUERY, new ResultSetExtractor() {
		public List<StudentDTO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentDTO> list = new ArrayList<StudentDTO>();
			while(rs.next()) {
				StudentDTO stud = new StudentDTO();
				stud.setId(rs.getInt("id"));
				stud.setName(rs.getString("name"));
				stud.setAge(rs.getInt("age"));
				stud.setCity(rs.getString("city"));
				list.add(stud);
			}
			return list;
		}
	});
	return studentList;
  }
}
