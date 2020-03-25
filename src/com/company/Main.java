package com.company;

import java.io.*;

//AufgabeAbteilungen
public class Main {

    public static void main(String[] args) throws IOException {

        // Creating instances of Departments
        Department vorstand = new Department("Vorstand");
        Department einkauf = new Department("Einkauf");
        Department einkaufEuropa = new Department("Einkauf Europa");
        Department einkaufItalien = new Department("Einkauf Italien");
        Department einkaufUSA = new Department("Einkauf USA");
        Department vertrieb = new Department("Vertrieb");
        Department vertriebEuropa = new Department("Vertrieb Europa");
        Department[] departments = {vorstand, einkauf, einkaufEuropa, einkaufItalien, einkaufUSA, vertrieb, vertriebEuropa};

        // Importing of file
        File myFile = new File("C:\\Users\\DCV\\Desktop\\Abteilungen.txt");
        FileReader fileReader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        // Addressing file content to departments
        while ((line = bufferedReader.readLine()) != null) {
            String[] splitValues = line.split(";");
            for (Department department : departments) {
                if (splitValues[1].equals(department.getDepartment()))
                    department.setPerson(new Person(splitValues[0]));
            }
        }

        // Console print of departments
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }
}
