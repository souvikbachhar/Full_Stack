package com.wipro.topgear;

import junit.framework.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "abc");

	}
}
