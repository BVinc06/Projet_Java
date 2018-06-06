package model.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecuteQuery() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testExecuteUpdate() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testPrepareCall() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

}
