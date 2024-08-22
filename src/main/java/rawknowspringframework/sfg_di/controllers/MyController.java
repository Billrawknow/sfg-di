package rawknowspringframework.sfg_di.controllers;


import org.springframework.stereotype.Controller;
import rawknowspringframework.sfg_di.services.GreetingService;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
