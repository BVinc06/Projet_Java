package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelFacadeTest {

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
	public void testGetExampleById() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testGetExampleByName() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testGetAllExamples() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

}
