package com.example.javainterop;

public class JavaInteropWithKotlin {

    public static void main(String[] args) {
        System.out.println("Java Interop with Kotlin");

        Person person = new Person("John", "Doe");
        System.out.println(person.getFirstName() + " " + person.getLastName());

        person.setFirstName("Jane");
        System.out.println(person.getFirstName() + " " + person.getLastName());

        Integer max = Math.max(10, 20);
        System.out.println("The max value is : " + max);

    }
}
