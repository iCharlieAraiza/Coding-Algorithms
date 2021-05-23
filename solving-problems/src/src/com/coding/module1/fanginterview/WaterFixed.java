package com.coding.module1.fanginterview;

public class WaterFixed {
    public int calculate(int[] container){
        int p1 = 0, p2=1, max = 0;

        while(p2<container.length){
            int num1 = container[p1];
            int num2 = container[p2];
            int length = p2-p1;
            int min = Math.min(num1,num2);

            max = Math.max(max, min * length);

            if(num2>num1){
                p1++;
                p2 = p1 + 1;
            }else{
                p2++;
            }

        }
        return max;
    }

    public int calculateLeetCode(int[] container){
        int i = 0,
            j = container.length-1,
            max = 0;

        while(i<j){
            int length = j-i;
            int min = Math.min(container[i], container[j]);

            max = Math.max(min * length, max);

            if( container[i] < container[j] ){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
