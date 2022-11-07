package JunitTesting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Assert;
import org.junit.Test;

public class AssertClass {
	
	@Test
	public void assertEq() {
		assertEquals(5, 5);
	}
	@Test
	public void assertNot() {
		assertNotEquals(7, 8);
	}
	@Test
	public void assetNull() {
		assertNull(null);
		//sysout    fjefjej
	}
	@Test
	public void assetNotNull() {
		assertNotNull("Vikram");
	}
	@Test
	public void assertTrue() {
		boolean val=7!=8;
		Assert.assertTrue(val);
	}
	@Test
	public void assertFalse() {
		boolean val2=8==6;
		Assert.assertFalse(val2);
	}
	@Test
	public void same() {
		assertSame("vikram", "vikram");
	}
	@Test
	public void notSame() {
		assertNotSame("Vikram", "vikram");
	}
	@Test
	public void arrayEquals() {
		int[] num1= {4,5,6,4,7};
		int[] num2= {4,5,6,4,7};
		assertArrayEquals(num1, num2);
	}
	

}
