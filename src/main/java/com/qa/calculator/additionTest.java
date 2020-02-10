package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class additionTest {

	@Test 
	
	public void addition() {
		
		assertEquals(10, Calculator.addtion(8, 2));
		
		
	}
}
