package com.souvik.repo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.souvik.dto.Employee;
import com.souvik.mapper.EmployeeRowMapper;

@Repository
public class myRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("myOracleDs")
	DataSource myDs;

	public int insertdata(Employee emp) {
		// TODO Auto-generated method stub
		//jdbcTemplate.setDataSource(myDs);

		System.out.println(emp.getEmployeeID());
		int a=jdbcTemplate.update("INSERT INTO EMPLOYEE (EMPLOYEEID,EMPLOYEENAME,EMPLOYEESALARY) VALUES(?,?,?)",new Object[]{emp.getEmployeeID(),emp.getEmployeeName(),emp.getEmployeeSalary()});
		//jdbcTemplate.query("SELECT * FROM EMPLOYEE",new EmployeeRowMapper());

		System.out.println(a);
		return a;
	}

	public List<Employee> showall() {
		// TODO Auto-generated method stub
		System.out.println("OK");
		
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE",new EmployeeRowMapper());

	}

	public List<Employee> show(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE where EMPLOYEEID =?", new Object[] { id },new EmployeeRowMapper());

	}
}
