package Testing.CalculationTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {
	
		int actual;
		
		@Test
		public void add() {
			int expected = 14;
			Calculation calculate = new Calculation();
			 actual = calculate.add (7,7);
			
			assertEquals(expected, actual);
			
		}

		@Test
		public void sub() {
			int expected = 9;
			Calculation calculate = new Calculation();
			actual = calculate.sub (15,6);
			
			assertEquals(expected, actual);
			
		}
		
		@Test
		public void mul() {
			int expected = 20;
			Calculation calculate = new Calculation();
			actual = calculate.mul (2,10);
			
			assertEquals(expected, actual);
			
		}
		
		@Test
		public void div() {
			int expected = 3;
			Calculation calculate = new Calculation();
			actual = calculate.div (15,5);
			
			assertEquals(expected, actual);
		}
	}


