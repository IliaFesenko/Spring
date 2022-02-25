package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
        //Dog yourDog = context.getBean("dog", Dog.class);
        //Cat myCat = context.getBean("cat", Cat.class);

        //System.out.println("Один и тотже обьект - " + (myDog==yourDog));

        context.close();
    }
}
