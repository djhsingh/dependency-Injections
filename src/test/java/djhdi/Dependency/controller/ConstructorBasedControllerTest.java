package djhdi.Dependency.controller;

import djhdi.Dependency.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedControllerTest {
    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        constructorBasedController = new ConstructorBasedController(new ConstructorGreetingService());
    }

    @Test
    void getGreets() {
        System.out.println(constructorBasedController.getGreets());
    }
}