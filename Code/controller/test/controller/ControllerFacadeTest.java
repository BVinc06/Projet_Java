package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;
import model.ModelFacade;
import view.IView;
import view.ViewFacade;

public class ControllerFacadeTest {
	
	private IView view;
	private IModel model;
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
		view = new ViewFacade();
		model = new ModelFacade();
		this.controllerFacade = new ControllerFacade(view, model);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetView() {
		IView expected = view;
		assertEquals(expected, controllerFacade.getView());
	}
	
	@Test
	public void testGetModel() {
		IModel expected = model;
		assertEquals(expected, controllerFacade.getModel());
	}

}
