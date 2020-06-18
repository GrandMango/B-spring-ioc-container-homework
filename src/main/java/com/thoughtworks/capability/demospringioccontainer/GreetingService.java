package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final Foo foo;
    private final Bar bar;

    public GreetingService(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    String sayHi() {
        foo.getBar().testMessage();
        bar.getFoo().testMessage();
        return "hello world";
    }
}
