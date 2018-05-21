package com.souvik.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.souvik.dto.Employee;


public class EmployeeRowMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee st = new Employee();
		st.setEmployeeID(Integer.parseInt((rs.getString("EMPLOYEEID"))));
		st.setEmployeeName((rs.getString("EMPLOYEENAME")));
		st.setEmployeeSalary(Integer.parseInt((rs.getString("EMPLOYEESALARY"))));
		return st;
	}
}
