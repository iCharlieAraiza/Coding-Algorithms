package com.coding;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Main {
    /*
    * TODO:
    *   [✅] Step 1: Understand and verify the constraints. Ask questions to the interviewer.
    *           For example: "All the numbers are positives, Aren't they"
    *                        "Are there duplicate numbers in the array?"
    *                        "Will there always be a solution avaible? What should it return if there is no solution?"
    *                        "Can there be a multiples solutions in the array?"
    *    -
    *   [✅] Step 2: Define the test cases.
    *           For example:  [1, 3, 7, 9 , 2]       t = 11        [3, 4]
    *                         [1, 3, 7, 9 , 2]       t = 25         null
    *                         []                     t = 1          null
    *                         [5]                    t = 5          null
    *                         [1, 6]                 t = 7         [0, 1]"
    *   -
    *   [✅] Step 3: Figure out solution without code.
    *   -
    *   [✅] Step 4: Get the time and space complexity:
    *                         Time:     O(n^2)
    *                         Space:    O(1)
    *
     */
    public static void main(String[] args) {
	// write your code here

        //[✅]
        // int[] result = sum( new int[]{1, 3, 7, 9, 2}, 11);
        //[✅]
        //int[] result = sum( new int[]{1, 3, 7, 9, 2}, 25);
        //[✅]
        // int[] result = sum( new int[]{}, 1);

        optimalSum( new int[]{1, 3, 7, 9, 2}, 11);


    }

    /*
    * Description: All the numbers are positive.
    *              There are not duplicate elements.
    *              Maybe there is a solution, in this case return null.
    *              There is only one solution in the array.
     */

    public static int[] sum(int[] arr, int target){
        if(arr.length <2) return  null;

        int length = arr.length;


        for(int i = 0; i < length; i++){
            for(int j = i+1; j<length; j++){
                if(arr[i]+arr[j]==target)
                    return new int[]{i,j};
            }
        }

        return null;
    }


    public static int[] optimalSum(int[] arr, int target){
        if(arr.length <2) return  null;

        int length = arr.length;
        int localTarget  = 0;

        for(int i = 0; i < length; i++){
            localTarget = target - arr[i];
            for(int j = i+1; j<length; j++){
                if(arr[j]==localTarget)
                    return new int[]{i,j};
            }
        }
        return null;
    }

    //   For example:  [1, 3, 7, 9 , 2]       t = 11        [3, 4]

    public static int[] bestSolution(int[] arr, int target){
        if(arr.length <2) return  null;

        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        int length = arr.length;

        for(int i = 0; i<length; i++){
            if(index.containsKey(arr[i])){
                return new int[]{index.get(arr[i]),i};
            }
            index.put(target-arr[i],i);
        }

        return null;
    }

}
