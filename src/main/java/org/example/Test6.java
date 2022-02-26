package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
        System.out.println("Stop");
        System.out.println("Kuku");
    }
}