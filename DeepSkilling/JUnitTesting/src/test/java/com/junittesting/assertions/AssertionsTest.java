package com.junittesting.assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {
	
	@Test
	public void TestAssertions() {
		
		//This method checks whether the passed values are equal or not.
		assertEquals(10, 7+3);
		
		//This method checks whether the passed value satisfies the given condition or not.
		assertTrue(10 > 9);
		
		//Similar to assertTrue() but check for false conditions.
		assertFalse(10 < 9);
		
		//checks whether the passed object is null or not.
		assertNull(null);
		
		//creates new object and checks that it isn't null.
		assertNotNull(new Object());
		
	}

}
