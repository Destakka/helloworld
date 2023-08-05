package com.helloworld.helloworld;

public class MethodParameter {
    public static void main(String[] args) {
        SayHello("Desta", "Atika");
    }

    private static void SayHello(String firstname, String lastname) {
        System.out.println("Hello" + firstname + "" + lastname);
    }
    
}
