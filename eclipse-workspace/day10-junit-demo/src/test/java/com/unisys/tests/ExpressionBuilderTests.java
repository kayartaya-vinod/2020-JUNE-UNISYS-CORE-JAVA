package com.unisys.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import com.unisys.utils.ExpressionBuilder;

public class ExpressionBuilderTests {

	ExpressionBuilder exp;
	
	@Before
	public void setup() {
		exp = new ExpressionBuilder();
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testAddOperations() {
		Double actual = exp.add(10).add(20).add(30).build();
		Double expected = 60.0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtractOperations() {
		Double actual = exp.subtract(10).subtract(20).subtract(30).build();
		Double expected = -60.0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMixedOperations() {
		Double actual = exp.add(10000).subtract(5000).multiply(3).divide(300).build();
		Double expected = 50.1;
		assertEquals(expected, actual);
	}
}






