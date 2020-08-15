package djhdi.Dependency.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Constructor based service";
    }
}
