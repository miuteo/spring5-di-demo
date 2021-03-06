package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimaryESGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return GREETING_PRIMARY_ES;
	}
}
