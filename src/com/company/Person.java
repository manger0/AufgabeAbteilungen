package com.company;

public class Person {

    //Variables
    private String name;

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    //Methodes
    @Override
    public String toString() {
        return name;
    }
}
