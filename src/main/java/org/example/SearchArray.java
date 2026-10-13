package org.example;

public class SearchArray {

    int[] dice;

    public SearchArray(int[] dice){

        this.dice = dice;
    }

    public int search(int target) {

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public void displaySummary(int index){

        if(index != -1){
            System.out.println("Index of the integer is " + index);
        }
        else{
            System.out.println("Not found");
        }
    }

}
