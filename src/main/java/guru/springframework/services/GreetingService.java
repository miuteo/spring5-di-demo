package guru.springframework.services;

/**
 * Created by jt on 5/24/17.
 */
public interface GreetingService {

    String GREETING = "hello from GreetingServiceImpl";
    String GREETING_SETTER = "hello from setter";
    String GREETING_CONSTRUCTOR = "hello from constructor";
    String GREETING_PRIMARY = "hello from primary";
    String GREETING_PRIMARY_ES = "hola from primary";
    String sayGreeting();
}
