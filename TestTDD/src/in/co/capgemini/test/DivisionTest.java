package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calc.Maths;

public class DivisionTest {

	@Test
	public void testTwoPositive() {
		
		Maths math = new Maths();
		int ans = math.division(8,4);
		Assert.assertEquals(2, ans);
		
	}
	
	@Test
	public void testTwoNegative() {
		
		Maths math = new Maths();
		int ans = math.division(-8,-4);
		Assert.assertEquals(2, ans);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideZero() {
		
		Maths math = new Maths();
		int ans = math.division(8,0);
		//Assert.assertEquals(2, ans);
		
	}

}
