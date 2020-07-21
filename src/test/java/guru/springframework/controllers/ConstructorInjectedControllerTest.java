package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
	ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp(){
		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void test(){
		assertEquals(GreetingServiceImpl.GREETING,constructorInjectedController.sayHello());
	}
}
