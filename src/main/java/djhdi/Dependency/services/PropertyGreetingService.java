package djhdi.Dependency.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Property based service";
    }
}

