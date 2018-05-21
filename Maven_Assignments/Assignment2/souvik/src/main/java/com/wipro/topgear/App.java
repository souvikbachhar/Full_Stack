package com.wipro.topgear;

import org.apache.commons.lang3.StringUtils;


public class App 
{
	public static void main( String[] args )
    {
        System.out.println(getHelloWorld());
      

    }
	
	
	 public static String getHelloWorld() {

			return StringUtils.deleteWhitespace("   ab  c  ");

		}
}
