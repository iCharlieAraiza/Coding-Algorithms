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
        //declare two pointers
        //While p1<p2;
        int max = 0;
        int p1 = 0, p2 = container.length-1;

        while(p1<p2){
            int num1 = container[p1];
            int num2 = container[p2];
            int min = Math.min(num1,num2);
            int length = p2-p1;

            int area =  min*length;
            if(area>max){
                max = area;
                p1++;
            }else{
                p2--;
            }
        }
        return max;
    }
}
