package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("catBean")
//@Scope("singleton")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("May-May");
    }
}
