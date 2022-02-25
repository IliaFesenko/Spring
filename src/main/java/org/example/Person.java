package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("PersonBean")
public class Person {
    //@Autowired
    //@Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    //@Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

  // @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Set Pet");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println(surname);
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(age);
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hallo, my lovely Pet");
        pet.say();
    }
}
