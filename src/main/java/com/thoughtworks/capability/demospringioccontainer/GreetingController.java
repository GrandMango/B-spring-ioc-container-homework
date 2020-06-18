package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/greet")
    public String greet() {

//        ApplicationContext context = new ClassPathXmlApplicationContext();
//        GreetingService prototypebean1 = (GreetingService) context.getBean("greetingservice");
//        System.out.println(prototypebean1);

        return greetingService.sayHi();
    }

}
