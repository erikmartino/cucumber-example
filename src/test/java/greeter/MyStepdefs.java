package greeter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    private GreetingService greeter;

    @Given("^a greeting service$")
    public void aGreetingService() throws Throwable {
         greeter = new GreetingService();
    }

    @Given("^a greeting service with a greeting (.*)$")
    public void aGreetingServiceWithAGreeting(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
