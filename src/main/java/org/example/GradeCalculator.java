package org.example;

public class GradeCalculator {

    private double mark;

    public GradeCalculator(double mark) {
        this.mark = mark;
    }
    public String getGrade() {

        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        } else if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 70) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void displaySummary(){

        System.out.println("--- Grade Report ---");
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + getGrade());
    }

}
