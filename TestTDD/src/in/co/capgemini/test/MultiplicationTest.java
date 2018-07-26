package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calc.Maths;

public class MultiplicationTest {

	@Test
	public void testTwoPositive() {
		Maths math = new Maths();
		int ans = math.multiply(4,6);
		Assert.assertEquals(24,ans);
	}
	
	@Test
	public void testPositiveNegative() {
		Maths math = new Maths();
		int ans = math.multiply(-4,6);
		Assert.assertEquals(-24,ans);
	}
	
	@Test
	public void testNegative() {
		Maths math = new Maths();
		int ans = math.multiply(-4,-6);
		Assert.assertEquals(24,ans);
	}
	
	@Test
	public void testPositiveZero() {
		Maths math = new Maths();
		int ans = math.multiply(4,0);
		Assert.assertEquals(0,ans);
	}
	
	@Test
	public void testNegativeZero() {
		Maths math = new Maths();
		int ans = math.multiply(-4,0);
		Assert.assertEquals(0,ans);
	}
	
	@Test
	public void testZero() {
		Maths math = new Maths();
		int ans = math.multiply(0,0);
		Assert.assertEquals(0,ans);
	}


}
