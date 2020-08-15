package djhdi.Dependency.controller;

import djhdi.Dependency.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {
    @Qualifier("setterGreetingService")
    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayHello();
    }
}
