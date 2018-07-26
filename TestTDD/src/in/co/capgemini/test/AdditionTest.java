package in.co.capgemini.test;

import  org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calc.Maths;

public class AdditionTest {

	@Test
	public void testAddTwoPositive() {
	
		Maths math = new Maths();
		int ans = math.add(2,2);
		Assert.assertEquals(4, ans);
	}
	@Test
	public void testAddTwoNegative() {
		
		Maths math = new Maths();
		int ans = math.add(-7,-2);
		Assert.assertEquals(-9, ans);
	}
	@Test
	public void testAddTwoZero() {
		
		Maths math = new Maths();
		int ans = math.add(0,0);
		Assert.assertEquals(0, ans);
	}
	@Test
	public void testGreaterPositiveSmallerNegative() {
		
		Maths math = new Maths();
		int ans = math.add(8,-3);
		Assert.assertEquals(5, ans);
	}
	@Test
	public void testGreaterNegativeSmallerPositive() {
		
		Maths math = new Maths();
		int ans = math.add(-8,3);
		Assert.assertEquals(-5, ans);
	}
	
	
	

}
