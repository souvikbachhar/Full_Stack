package com.souvik.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.souik.mapper.EmployeeRowMapper;
import com.souvik.dto.Employee;

@Repository
public class myRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("myOracleDs")
	DataSource myDs;

	public Employee getValueFromDao(String id) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(myDs);
		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EmployeeID = ?", new Object[] { id },
				new EmployeeRowMapper());
	}

	public List<Employee> getAllValueFromDao() {
		jdbcTemplate.setDataSource(myDs);
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE order by EmployeeID",new EmployeeRowMapper());
	}

	public List<Employee> deletefromDao(String id) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(myDs);
		jdbcTemplate.update("delete FROM EMPLOYEE where EmployeeID = ?",new Object[]{id});
		return getAllValueFromDao();
	}

	public List<Employee> updateFromDao(String id,int sal) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.setDataSource(myDs);
		jdbcTemplate.update("update EMPLOYEE set EmployeeSalary = ? where EmployeeID= ?",new Object[]{sal,Integer.parseInt(id)});
		return getAllValueFromDao();
	}

	public List<Employee> insertFromDao(String id, int sal, String name) {
		System.err.println(id+"  "+sal+"  "+name);
		jdbcTemplate.setDataSource(myDs);
		jdbcTemplate.update("insert into EMPLOYEE values(?,?,?)",new Object[]{Integer.parseInt(id),name,sal});
		return getAllValueFromDao();
	}


}
