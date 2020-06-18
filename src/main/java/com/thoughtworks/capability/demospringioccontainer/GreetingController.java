package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        System.out.println("Creating GreetingController.");
        this.greetingService = greetingService;
    }

    @Lookup
    public GreetingService service() { return null;}

    @GetMapping("/greet")
    public String greet() {
        return service().sayHi();
        //return greetingService.sayHi();
    }

}
