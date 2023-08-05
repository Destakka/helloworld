package com.helloworld.helloworld;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Desta");
        sayHello("Desta", " Atikananda");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + lastName);}
    }
