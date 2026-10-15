package org.example;

public class StudentDetails {
    String name = "Naledi";
    int age = 20;
    double avg = 76.5;
    boolean isRegistered = true;

    public StudentDetails(String name, int age, double avg, boolean isRegistered){

        this.name = name;
        this.age = age;
        this.avg = avg;
        this.isRegistered = isRegistered;
    }

    public void displaySummary(boolean isRegistered){

        System.out.println("Student Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Average Mark:" + avg);
        System.out.println("Registered:" + isRegistered);

    }
}
