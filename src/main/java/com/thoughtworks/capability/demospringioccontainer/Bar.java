package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {

    @Autowired
    private Foo foo;

//    public Bar(Foo foo) {
//        this.foo = foo;
//    }

//    @PostConstruct
//    public void init() {
//        foo.setBar(this);
//    }
//
    public Foo getFoo() {
        return foo;
    }
//
//    public void setFoo(Foo foo) {
//        this.foo = foo;
//    }

    public void testMessage() {
        System.out.println("Echo from Bar");
    }
}
