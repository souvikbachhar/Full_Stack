package com.souvik.ass3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class StudentMapper implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setStudentName(rs.getString("NAME"));
		st.setStudentId(rs.getString("ID"));
		return st;
	}
}
