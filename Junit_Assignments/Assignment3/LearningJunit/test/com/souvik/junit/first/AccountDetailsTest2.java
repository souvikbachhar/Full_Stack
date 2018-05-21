package com.souvik.junit.first;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountDetailsTest2 {
	private AccountDetails ac;
	@Before
	public void initialise()
	{		ac = new AccountDetails();
	}
	
	@Test
	public void testDeposit() {
		assertEquals("Deposit",ac.Deposit());
	}

	@Test
	public void testWithdraw() {
		assertEquals("WithDraw",ac.Withdraw());
	}

	@Test
	public void testCreditcard() {
		assertEquals(1,ac.creditcard());
	}

}
