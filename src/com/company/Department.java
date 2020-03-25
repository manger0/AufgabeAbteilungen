package com.company;

public class Department {

    //Variables
    private Person[] persons = new Person[10];
    private String department;
    private int employees;

    //Constructor
    public Department(String department) {
        this.department = department;
    }

    //Methodes
    public void setPerson(Person person) {
        this.persons[employees] = person;
        employees++;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        StringBuilder personsString = new StringBuilder();
        for (int i = 0; i < employees; i++) {
            personsString.append("(").append(persons[i]).append(") ");
        }
        return department + "\t-\t" + employees + "Mitarbeiter: " + personsString;
    }
}
