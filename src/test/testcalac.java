package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pro.calc;



public class testcalac {

	static calc c ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		c = new calc();
	}

	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Test
	public void Add_Zeros_Zero() 
	{
		int expected = 0;
		int actual = c.add(0,0);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void Add_ZeroAndInt_TheInt() 
	{
		int expected = 9;
		int actual = c.add(0,9);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void Add_TwoPositiveInts_PositiveInt() 
	{
		int expected = 10;
		int actual = c.add(2,8);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void Add_PositiveBiggerThanNegative_PositiveInt() 
	{
		int expected = 5;
		int actual = c.add(10,-5);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void Add_NegativeBiggerThanPositive_NegativeInt() 
	{
		int expected = 5;
		int actual = c.add(10,-5);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void Add_EqualPositiveNegative_Zero() 
	{
		int expected = 0;
		int actual = c.add(5,-5);
		assertEquals(expected,actual);
		
	}
}
