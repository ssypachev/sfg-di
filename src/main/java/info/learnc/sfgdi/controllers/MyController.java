package info.learnc.sfgdi.controllers;

import info.learnc.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting () {
        return greetingService.sayGreeting();
    }

    public String sayHello () {
        System.out.println("Hello, world!");
        return "Hi there!";
    }

}
