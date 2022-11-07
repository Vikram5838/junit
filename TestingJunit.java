package JunitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingJunit {
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	@Test
	public void testCase() {
		System.out.println("This is test");
	}
	@After
	public void afterCase() {
		System.out.println("Thank You");
	}

}
