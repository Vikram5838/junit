package JunitTesting;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
		Calculator c=new Calculator();
		@Before
		public void num() {
			System.out.println("Enter two values");
		}
		@Test
		public void testAdd() {
			c.add(7, 8);
		}
		@Test
		public void testSub() {
			c.sub(77, 99);
		}
		@Test
		public void testMul() {
			c.mul(55, 66);
		}
		@Test
		public void testDiv() {
			c.div(10, 2);
		}
		@After
		public void val() {
			System.out.println("Thank you");
		}
	
	

}
