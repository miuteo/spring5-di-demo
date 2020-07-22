package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp(){
		this.setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void test(){
		assertEquals("Hello Gurus!!!! - Original",setterInjectedController.sayHello());
	}
}
