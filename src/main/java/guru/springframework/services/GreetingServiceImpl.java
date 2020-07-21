package guru.springframework.services;

public class GreetingServiceImpl implements GreetingService {
	public static final String GREETING = "hello from GreetingServiceImpl";

	@Override
	public String sayGreeting() {
		return GREETING;
	}
}
