package com.wipro.topgear;

import junit.framework.Assert;
import org.junit.Test;
	
public class AppTest2 
{	
	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}
}
