package com.souvik.ass3;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
public class DataBaseConfig {
	@Bean(name="DataBaseConfig")
	@Primary
	public DataSource myOracleDs() throws SQLException{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUsername("topgear");
		ds.setPassword("topgear");
		ds.setUrl("jdbc:oracle:thin:@localhost:1522/xe");
		return ds;
	}
	
	
}
