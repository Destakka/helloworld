package com.helloworld.BelajarOOP;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddres)
    {
        this.name = paramName;
        this.address = paramAddres;
    }

    Person(String paramName) 
    {
        this(paramName, null);
    }

    Person() 
    {
        this(null);
    }

    void sayHello(String paramName) 
    {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
