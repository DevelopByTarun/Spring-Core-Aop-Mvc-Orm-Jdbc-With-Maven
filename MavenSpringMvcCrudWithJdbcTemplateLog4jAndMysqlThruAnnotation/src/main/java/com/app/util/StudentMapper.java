package com.app.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.app.model.StudentDTO;

public class StudentMapper implements RowMapper {
	
	public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDTO stud = new StudentDTO();
		stud.setId(rs.getInt("id"));
		stud.setName(rs.getString("name"));
		stud.setAge(rs.getInt("age"));
		stud.setCity(rs.getString("city"));
		return stud;
	}
}
