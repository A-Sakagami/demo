package com.example;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person p = new Person("graffical");
        p.setFirstName("Ryohma");
        p.setLastName("Sakamoto");
        p.setAge(20);
        System.out.println("My name is " + p.getLastName() + " " + p.getFirstName()+".");
        System.out.println("My age is " + p.getAge() + " years old.");
        
    }
}
