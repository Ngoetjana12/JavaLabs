package org.example;

public class EvenOdd {

    int[] evenOdd;
    int[] even;
    int[] odd;

    public EvenOdd(int[] evenOdd){

        this.evenOdd = evenOdd;
    }
    public int countEven(int[] evenOdd){

        int numEven = 0;
        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i]%2 == 0){
                numEven++;
            }
        }
        return numEven;
    }
    public int countOdd(int[] evenOdd){

        int numOdd = 0;
        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i]%2 != 0){
                numOdd++;
            }
        }
        return numOdd;
    }
    public int[] evenArray(int[] evenOdd, int numEven){

        int[] evenNumbers = new int[numEven];
        int index = 0;

        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i]%2 == 0){

                evenNumbers[index] = evenOdd[i];
                index++;
            }
        }
        return evenNumbers;
    }

    public int[] oddArray(int[] evenOdd, int numOdd){

        int[] oddNumbers = new int[numOdd];
        int index = 0;

        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i]%2 != 0){

                oddNumbers[index] = evenOdd[i];
                index++;
            }
        }
        return oddNumbers;
    }

    public void displaySummary(int numEven, int numOdd, int[] evenNumbers, int[] oddNumbers){

        System.out.println("There are " + numEven + " even number");
        System.out.println(evenNumbers);
        System.out.println("There are " + numOdd + " odd number");
        System.out.println(oddNumbers);
    }
}
