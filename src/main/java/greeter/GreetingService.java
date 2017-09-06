package greeter;

public class GreetingService {
    private final String greeting;

    public GreetingService(String message) {
        this.greeting = message;
    }

    public GreetingService() {
        this("Hej");
    }
    /*
    public final String message;


    public GreetingService(String message) {
        this.message = message;
    }
    */

    public String sayHello() {
        return greeting;
    }
}
