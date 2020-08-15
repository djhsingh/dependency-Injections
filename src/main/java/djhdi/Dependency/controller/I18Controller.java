package djhdi.Dependency.controller;

import djhdi.Dependency.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    private final GreetingService greetingService;

    public I18Controller(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello World");
        return greetingService.sayHello();
    }
}
