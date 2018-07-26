package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calc.Maths;

public class SubtractionTest {

	@Test
	public void testGreaterPositiveSmallerPositive() {
		Maths math = new Maths();
		int ans = math.sub(8, 5);
		Assert.assertEquals(3, ans);
	}
	
	@Test
	public void testGreaterNegativeSmallerPositive() {
		Maths math = new Maths();
		int ans = math.sub(-8, 5);
		Assert.assertEquals(-13, ans);
	}
	
	@Test
	public void testPositiveZero() {
		Maths math = new Maths();
		int ans = math.sub(8, 0);
		Assert.assertEquals(8, ans);
	}
	
	@Test
	public void testGreaterNegativeSmallerNegative() {
		Maths math = new Maths();
		int ans = math.sub(-8, -5);
		Assert.assertEquals(-3, ans);
	}
	
	
	@Test
	public void testSmallerNegativeGreatererNegative() {
		Maths math = new Maths();
		int ans = math.sub(-8, -12);
		Assert.assertEquals(4, ans);
	}
	
	@Test
	public void testNegativeZero() {
		Maths math = new Maths();
		int ans = math.sub(-8, 0);
		Assert.assertEquals(-8, ans);
	}
}
