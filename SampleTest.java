package JunitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {
	@Before
	public void Add() {
		int a=12;
		int b=10;
		System.out.println(b+a);
	}
	@Test
	public void test() {
		System.out.println("Test Pass");
	}
	@Test
	public void test1() {
		System.out.println("Test Failed");
	}
	@After
	public void afterAdd() {
		System.out.println("thank you");
	}

}
