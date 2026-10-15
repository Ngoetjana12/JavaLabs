package org.example;

import java.util.ArrayList;

public class EvenOdd {

    int[] evenOdd;
    int[] even;
    int[] odd;

    public EvenOdd(int[] evenOdd){

        this.evenOdd = evenOdd;
    }
    public void count(int[] evenOdd){

        int numEven = 0;
        int numOdd = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i]%2 == 0){
                evenNumbers.add(evenOdd[i]);
                numEven++;
            }else{
                oddNumbers.add(evenOdd[i]);
                numOdd++;
            }
        }
        System.out.println("There are " + numEven + " even number");
        System.out.println(evenNumbers);
        System.out.println("There are " + numOdd + " odd number");
        System.out.println(oddNumbers);
    }



}
