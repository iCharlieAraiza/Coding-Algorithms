package com.coding.module1.fanginterview;

import java.util.ArrayList;

/**
 *  Given an array of integers, return the indices add the two numbers
 *  that add up to a given target
 */


/*
*
* 1. Rename the problem:
*    Get the index of the elements that the sum of both are equal to the
*    pass argument
*
* 2. Input
*    -Array of integers
*    -Integer target value
*
* 3. Output
*   -An array of two indices
*
* 4. Restrictions
*   -If there are not results, return null;
*   -There are only Integers
*   -There will be negative numbers
*   -The numbers in the list are uniques
*
* 5. Target
*   -Target
*   -numbers
*   -resultIndices
*
* */

public class ShowIndices {
    private int[] numbers;

    public ShowIndices(int[] numbers){
        this.numbers = numbers;
    }

    public ArrayList<Integer> calculateFirst(int target){
        if(numbers.length<2){
            return null;
        }

        //1. Check all elements of the array using a mobile pointer

        int count = 0;
        ArrayList<Integer> indexes = new ArrayList<>();

        for(int i = 0; i<numbers.length; i++){
            count = i;
            while(++count<numbers.length){
                if(numbers[i] + numbers[count] == target){
                    indexes.add(i);
                    indexes.add(count);
                    return indexes;
                }
            }

        }
        return null;
    }
}
