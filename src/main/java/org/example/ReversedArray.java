package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class ReversedArray {

    int[] listofNumbers = {1, 2, 3, 4, 5, 6};

    List<Integer> numbersList = new ArrayList<>();

    void reverseArr(){

        for(int i = listofNumbers.length -1; i>=0; i--){

            numbersList.add(listofNumbers[i]);
        }

        System.out.println(Arrays.toString(listofNumbers));
        System.out.println(numbersList);
    }
}
