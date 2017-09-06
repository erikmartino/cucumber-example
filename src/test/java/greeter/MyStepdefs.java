package greeter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    private GreetingService greeter;
    private String greeting;

    @Given("^a greeting service$")
    public void aGreetingService() throws Throwable {
         greeter = new GreetingService();
    }

    @Given("^a greeting service with a greeting (.*)$")
    public void aGreetingServiceWithAGreeting(String message) throws Throwable {
        greeter = new GreetingService(message);
    }

    @When("^I say hello$")
    public void iSayHello() throws Throwable {
        greeting = greeter.sayHello();
    }

    @Then("^I am greeted with (.*)$")
    public void iAmGreetedWithHej(String msg) throws Throwable {
        assert greeting.equals(msg);
    }

    @Then("^I get a long greeting$")
    public void iGetALongGreeting() throws Throwable {
        assert  greeting.length() > 10;
    }
/*
    @Given("^a greeting service with a greeting$")
    public void aGreetingServiceWithAGreetingBODY(String greeting) throws Throwable {
        aGreetingServiceWithAGreeting(greeting);
    }*/
}
