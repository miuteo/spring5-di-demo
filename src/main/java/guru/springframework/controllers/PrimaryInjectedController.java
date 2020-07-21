package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {
	GreetingService greetingService;

	public PrimaryInjectedController(GreetingService greetingService){
		this.greetingService = greetingService;
	}

	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
