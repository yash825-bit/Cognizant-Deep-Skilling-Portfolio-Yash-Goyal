package com.junittesting.basic;

import org.junit.Assert;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		
		Calculator calculator = new Calculator();
		
		int result = calculator.add(5, 9);
		
		Assert.assertEquals(14, result);
		
	}

}
