package com.souvik;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public String connect(String drivername,String url,String uname,String pwd)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,uname,pwd);
		}
		catch(Exception e)
		{	System.out.println(e);
			return "false";
		
			}
		return "true";

	}
}
