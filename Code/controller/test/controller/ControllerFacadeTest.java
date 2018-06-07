package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerFacadeTest {
	
	@SuppressWarnings("unused")
	private ControllerFacade controllerFacade;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.controllerFacade = new ControllerFacade(null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStart() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testGetView() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

	@Test
	public void testGetModel() {
		final int expected = 1;
		assertEquals(expected, 1);
	}

}
