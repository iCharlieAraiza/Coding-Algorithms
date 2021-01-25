package com.coding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[] array;

    @BeforeEach
    void beforeEach(){
        array =  new int[]{1, 3, 7, 9 , 2};
    }

    @Test
    void firstCorrectSolution(){
        assertArrayEquals(new int[]{3, 4}, Main.sum(array, 11));
    }

    @Test
    void firstWrongSolution(){
        assertArrayEquals(null, Main.sum(array, 25));
    }

    @Test
    void firstCorrectOptimalSolution(){
        assertArrayEquals(new int[]{3, 4}, Main.optimalSum(array, 11));
    }

    @Test
    void firstWrongOptimalSolution(){
        assertArrayEquals(null, Main.optimalSum(array, 25));
    }

    @Test
    void firstCorrectBestSolution(){
        assertArrayEquals(new int[]{3, 4}, Main.bestSolution(array, 11));
    }

    @Test
    void firstWrongBestSolution(){
        assertArrayEquals(null, Main.bestSolution(array, 25));
    }
}