package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserOrderTest {
	
	private UserOrder userOrder;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userOrder = new UserOrder();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetOrder() {
		Order expected = Order.NOP;
		assertEquals(expected, userOrder.getOrder());
	}

	@Test
	public void testGetPlayer() {
		final int expected = 0;
		assertEquals(expected, userOrder.getPlayer());
	}

}
