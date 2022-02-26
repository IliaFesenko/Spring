package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfWithAnn1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();
        System.out.println("Hi, it's new!");
        System.out.println("Hi, it's number 2");
        context.close();
    }
}
