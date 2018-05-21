package com.souvik.ass3;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("StudentRepo")
public class StudentRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("myOracleDs")
	DataSource myDs;
	
	public void getAllDetails() {
//		jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(myDs);
		System.out.println(myDs);
		System.out.println("Hello");
	}

}
