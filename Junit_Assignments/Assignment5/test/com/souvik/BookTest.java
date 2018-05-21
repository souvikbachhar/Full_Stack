package com.souvik;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BookTest {
	private int inputamount;
	private int discount;
	private int expectedResult;
	private Book book;
	
	public BookTest(int inputamount,int discount,int expectedresult){
		this.inputamount=inputamount;
		this.discount=discount;
		this.expectedResult=expectedresult;
	}
	
	@Before
	public void initialise()
	{		book = new Book();
	}
	
	@Test
	public void testDiscountedPrice() {
		System.out.println("Testing with " + inputamount);
		assertEquals(expectedResult,book.discountedPrice(inputamount,discount),0.0001);
	}
	@Parameterized.Parameters
	   public static Collection Words() {
	      return Arrays.asList(new Object[][] {
	         { 100,20,80 },
	         { 1000,20,800 },
	         { 2000,20,1600 },
	         { 100,10,90 },
	         { 100,15,85 }
	      });
	   }
}
