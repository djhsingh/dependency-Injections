package djhdi.Dependency.controller;

import djhdi.Dependency.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {
    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreetings() {
        System.out.println(setterBasedController.getGreetings());
        ;
    }
}