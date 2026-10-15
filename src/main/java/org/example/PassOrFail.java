package org.example;

public class PassOrFail {
    private double mark;

    public PassOrFail(double mark){

        this.mark = mark;
    }
    public String getResult(){

        if(mark < 0 || mark >100){
            return "Invalid Mark!";
        }
        else{
            if(mark >= 50){
                return "Pass";
            }else{
                return "Fail";
            }
        }
    }

    public void displaySummary(){

        System.out.println("Pass Or Fail");
        System.out.println("Mark:" + 56);
        System.out.println("Result:" + getResult());
    }
}
