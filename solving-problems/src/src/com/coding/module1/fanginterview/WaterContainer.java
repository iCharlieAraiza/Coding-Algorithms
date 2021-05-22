package com.coding.module1.fanginterview;



/*
*   Given a positive itergers array , whre each interger represents the height,
*   Find two lines which together hold more water. Return the area of mode water
* */


/*
*
*   1.Reintepreting
*   Calculate the max water area
*
*   2. Input
*   - Array of intergers
*
*   3. Output
*   - Interger
*
*   4.
*
*   5. Label
*   - Container
*   - Area
* */

public class WaterContainer {
    private int[] container;
    public WaterContainer(int[] container){
        this.container = container;
    }



    public int calculateFirst(){
        int area = 0;

        for(int i = 0; i<container.length-1; i++){
            for(int j = i+1; j<container.length; j++){
                int length = j-i;
                int min = Math.min(container[i], container[j]);
                area = Math.max(length * min, area);
            }
        }

        return area;
    }
}
