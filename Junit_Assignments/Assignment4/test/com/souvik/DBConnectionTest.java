package com.souvik;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DBConnectionTest {
	private String drivername;
	private String url;
	private String uname;
	private String pwd;
	private DBConnection db;
	
	@Before
	public void initialise(){
		drivername="oracle.jdbc.driver.OracleDriver";
		uname="topgear";
		pwd="topgear";
		url="jdbc:oracle:thin:@localhost:1522:xe";
		db=new DBConnection();
	}
	
	@Test
	public void testConnect() {
		assertEquals("true",db.connect(drivername, url, uname, pwd));
	}

}
