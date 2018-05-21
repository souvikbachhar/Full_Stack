package com.souvik;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySortTest {

	@Test
	public void test() {
		
		ArraySort a=new ArraySort();
		int[] expecteds ={100,200,300}; 
		int[] test={200,300,100};
		assertArrayEquals(expecteds, a.sortNumbers(test));
			}

}
