package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype") Без указания скопа будет дефолтный скоп
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Dog: Init Method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: Destroy Method");
    }

    @Override
    public void say() {
        System.out.println("Wuf-Wuf");
    }
}
