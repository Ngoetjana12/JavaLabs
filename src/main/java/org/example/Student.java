package org.example;

public class Student {

    String name;
    String studentNumber;
    double mark;

    Student(String studName, String stuNumber, double studMark){

        name = studName;
        studentNumber = stuNumber;
        mark = studMark;
    }
    void display(){

        System.out.println("Name:" + name);
        System.out.println("Student Number:" + studentNumber);
        System.out.println("Mark:" + mark);
        System.out.println("Passed?" + hasPassed(mark));

    };

    boolean hasPassed(double mark){

        boolean isPass = false;

        if(mark >= 50){
            isPass = true;
        }
        return isPass;
    }
}
