package org.example;

public class NumberAnalysis {

    private int number;

    public NumberAnalysis(int number) {
        this.number = number;
    }

    public String getSign() {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public String getParity() {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public void displaySummary() {
        System.out.println("--- Number Analysis ---");
        System.out.println("Number: " + number);
        System.out.println("Sign: " + getSign());
        System.out.println("Parity: " + getParity());
    }
}
