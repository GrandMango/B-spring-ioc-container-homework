package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    @Autowired
    private Bar bar;

//    public Foo(@Lazy Bar bar) {
//        this.bar = bar;
//    }

    public Bar getBar() {
        return bar;
    }
//
//    public void setBar(Bar bar) {
//        this.bar = bar;
//    }
public void testMessage() {
    System.out.println("Echo from Foo");
}

}
