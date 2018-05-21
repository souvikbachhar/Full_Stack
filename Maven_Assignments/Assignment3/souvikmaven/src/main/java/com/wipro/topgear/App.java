package com.wipro.topgear;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( StringUtils.deleteWhitespace("   ab  c  "));
        
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","topgear","topgear");
        	Statement stmt=con.createStatement();  
        	stmt.executeUpdate("insert into employee values(4,'arpan',55555)");
        	ResultSet rs=stmt.executeQuery("select * from employee"); 
        	while(rs.next())  
        	{	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        	
        	}
        	con.close();
        	
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }
}
