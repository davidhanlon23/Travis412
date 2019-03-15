package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus(){
		SimpleCalculator calc2 = new SimpleCalculator();
		assertEquals(calc2.minus(5,3), 2);
	}
	
	@Test
	public void testMultiply(){
		SimpleCalculator calc3 = new SimpleCalculator();
		assertEquals(calc3.multiply(4,3), 12);
	}
	
	@Test
	public void testDivide(){
		SimpleCalculator calc4 = new SimpleCalculator();
		assertEquals(calc4.divide(4,2), 2);
	}
}
