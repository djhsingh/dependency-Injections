package djhdi.Dependency.controller;

import djhdi.Dependency.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController {

    private final GreetingService greetingService;

    public ConstructorBasedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreets() {
        return greetingService.sayHello();
    }
}
