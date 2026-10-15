package org.example;

public class StudentSystem {
    String studentNumber;
    String name;
    int[] marks = new int[3];

    StudentSystem(){}


    StudentSystem(String studentNumber, String name, int[] marks){

        this.studentNumber = studentNumber;
        this.name = name;
        this.marks = marks;
    }
    double calcAvg(){

        double avg = 0;
        double total = 0;

        for(int i = 0; i<this.marks.length ; i++){

            total = total + this.marks[i];
        }
        avg = total/this.marks.length;

        return avg;
    }
    void determineResult(double avg){

        int count = 0;

        if(avg >= 50){

            System.out.println("You have passed!");
            System.out.println("Your average is " + avg);

        }else{
            System.out.println("Try again next semester!");
        }

    }
    void highestAvg(double[] avgs){

        double highest = avgs[0];

        for(int i = 0; i<avgs.length; i++){

            if(avgs[i] > highest){
                highest = avgs[i];
            }
        }

        System.out.println("The highest average is " + highest);

    }
/*    void getStudent(double avgHighest, double[] avgs){

        for(int i=0 ; i<avgs.length; i++){


        }
    }
 */
    void countPassed(double[] avgs){

        int count = 0;

        for(int i = 0; i<avgs.length; i++){

            if(avgs[i] >= 50){
                count++;
            }
        }

        System.out.println("The number of the student who passed is " + count);
    }
}
