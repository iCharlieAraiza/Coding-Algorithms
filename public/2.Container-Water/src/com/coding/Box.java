package com.coding;

/**
 * Todo:
 *  -
 *  - [✅] Step 1: Understand and verify the constraints
 *                 -You just have to get the volume (area) between two of the biggest numbers into the array.
 *  -
 *  - [✅] Step 2: Define the test cases.
 *                 - [7, 1, 2, 3, 9]    7*4 =  28
 *                 - []                        0
 *                 - [2]                       0
 *                 - [6, 9, 3, 4, 5, 8]  8*4 = 32
 *
 */

public class Box {


    //This is the obvious solution O(n^2)

    public static int firstSolution(int[] array){
        int length = array.length;

        //Return 0 if the array length is < 2

        if(length <2)
            return 0;

        int max = 0;

        for(int i = 0; i<length; i++){
            for (int j = i+1; j < length; j++){
                int area = (j-i) * Math.min(array[i],array[j]);
                max = Math.max(max, area);
            }
        }

        return max;
    }


    //This is the optimal solution O(n)

    public static int optimalSolution(int[] arr){
        int length = arr.length;
        if(length<2)
            return 0;
        int max = 0,
            p1 = 0,
            p2 = length-1;

        while (p1<p2){
            int height = Math.min(arr[p1], arr[p2]);
            int width = Math.max(p1, p2)-Math.min(p1,p2);
            int area = height*width;
            max = Math.max(max, area);

            if(arr[p1]<arr[p2]){
                p1++;
            }else{
                p2--;
            }
        }


        return max;
    }


}
