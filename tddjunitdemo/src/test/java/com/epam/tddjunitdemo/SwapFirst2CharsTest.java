package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapFirst2CharsTest {
	
	/* TODO List
	 * 1. “ABCD” => “BCD”  -> success
     * 2. “AACD” => “CD”   -> success
     * 3. “BACD” => “BCD”  -> success
     * 4. “BBAA” => “BBAA” -> success      
     * 5. “AABAA” => “BAA” -> success
	 */
	Delete d;
	
	@BeforeEach
	void setUp()
	{
	    d = new Delete();	
	}

	@Test
	void test1()
	{
		assertEquals("BCD",d.remove("ABCD"));
	}
	@Test
	void test2() 
	{
		assertEquals("CD",d.remove("AACD"));	
	}
	@Test
	void test3() 
	{
		assertEquals("BCD",d.remove("BACD"));
	}
	@Test
	void test4() 
	{
		assertEquals("BBAA",d.remove("BBAA"));
	}
	@Test
	void test5() 
	{ 
		assertEquals("BAA",d.remove("AABAA"));
	}
	
}
