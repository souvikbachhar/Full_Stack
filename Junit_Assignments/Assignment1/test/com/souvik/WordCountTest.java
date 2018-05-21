package com.souvik;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class WordCountTest {
	private String inputString;
	private int expectedResult;
	private WordCount wc;
	
	@Before
	public void initialise()
	{		wc = new WordCount();
	}
	
	@Test
	public void testWcount() {
		System.out.println("Testing with" + inputString);
		//assertEquals("Result",3,wc.wcount("I am Souvik"));
		assertEquals(expectedResult,wc.wcount(inputString));
	}
	
	public WordCountTest(String inputString, int expectedResult){
		this.inputString = inputString;
	    this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	   public static Collection Words() {
	      return Arrays.asList(new Object[][] {
	         { "I am Souvik", 3 },
	         { "I am", 3 },
	         { "I", 1 },
	         { "I am Souvik Bachhar", 4 },
	         { "I Souvik", 2 }
	      });
	   }

}
