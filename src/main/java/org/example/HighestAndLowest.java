package org.example;

public class HighestAndLowest {

    int[] values;

    public HighestAndLowest(int[] values){

        this.values = values;
    }

    public int getLargestValue() {

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public int getSmallestValue() {

        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public int getElementCount() {
        return values.length;
    }

    public int countAbove50(int[] values){

        int count = 0;

        for(int i = 0; i<values.length; i++){

            if(values[i] >= 50){
                count++;
            }
        }
        return count;
    }

    public void displaySummary(int max, int min, int length, int count){

        System.out.println("The larget number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The length is " + length);
        System.out.println("There are " + count + " numbers that are above or equal to 50");
    }

}
