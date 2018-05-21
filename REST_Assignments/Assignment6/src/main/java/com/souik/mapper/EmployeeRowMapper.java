package com.souik.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.souvik.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet rs,int Rownum) throws SQLException{
		
		Employee emp = new Employee();
		emp.setEmpId(Integer.parseInt(rs.getString("EMPLOYEEID")));
		emp.setEmpName(rs.getString("EMPLOYEENAME"));
		emp.setEmpSalary(Integer.parseInt(rs.getString("EMPLOYEESALARY")));
		return emp;
	}
}
