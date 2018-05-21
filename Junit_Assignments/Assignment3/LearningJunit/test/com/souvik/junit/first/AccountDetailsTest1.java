package com.souvik.junit.first;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AccountDetailsTest1 {
	private AccountDetails ac;
	
	
	@Before
	public void initialise()
	{		ac = new AccountDetails();
	}
	@Test
	public void testActNo() {
		assertEquals(1,ac.actNo(1));
	}

	@Test
	public void testAcctName() {
		assertEquals("Souvik",ac.acctName("Souvik"));
	}

	@Test
	public void testAcctBal() {
		assertEquals(10000,ac.acctBal(10000),0.0001);
	}

}
