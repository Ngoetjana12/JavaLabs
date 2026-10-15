package org.example;

public class StudentsArray {
    int[] marks;

    public StudentsArray(int[] marks){

        this.marks = marks;
    }

    public double getTotal(int[] marks){

        double total = 0;
        for(int mark : marks){
            total += mark;
        }

        return total;
    }
    public double getAvg(int[] marks, double total){

        double avg = total / marks.length;
        return avg;
    }

    public void displaySummary(double total, double avg){

        System.out.println("The total of the marks is: " + total);
        System.out.println("The average of the marks is: " + avg);
    }
}
