package org.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    private Array test;

    @BeforeEach
    public void beforeEach(){
        test = new Array();
    }

    @Test
    public void checkIndexofSumm(){
        int[] indexes = test.getSumOfIndex(new int[]{1,2,3,4,5,6,7,8,9},10);
        for (int number : indexes){
            System.out.println(number);
        }
    }

    @Test
    public void checkIndexOfSumOptimized(){
        int[] indexes = test.getSumOfIndexOptimal(new int[]{1,2,3,4,5,6,7,8,9},10);
        for (int number : indexes){
            System.out.println(number);
        }
    }
}