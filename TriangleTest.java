package com.Triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTestEquil() throws Exception{
		assertEquals((String)"Equilateral",Triangle.testTriangle(5,5,5));
	}
	@Test
	public void testTestIsosceles() throws Exception{
		assertEquals((String)"Isosceles",Triangle.testTriangle(5,5,2));
	}
	@Test
	public void testTestScalene() throws Exception{
		assertEquals((String)"Scalene",Triangle.testTriangle(3,4,5));
	}
}
