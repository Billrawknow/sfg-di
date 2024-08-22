package rawknowspringframework.sfg_di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import rawknowspringframework.sfg_di.services.GreetingService;

@Controller
public class PropertyInjectedController {

   @Qualifier("propertyInjectedGreetingService")
    @Autowired

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
