package com.coding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    int[] array;

    @BeforeEach
    void beforeEach(){
        array = new int[]{7, 1, 2, 3, 9};
    }

    @Test
    void firstCorrectSolution(){
        assertEquals(28, Box.firstSolution(array));
    }

    @Test
    void secondCorrectSolution(){
        array = new int[]{6, 9, 3, 4, 5, 8};
        assertEquals(32, Box.firstSolution(array));
    }

    @Test
    void firstWrongSolution(){
        array = new int[]{};
        assertEquals(0, Box.firstSolution(array));
    }

    @Test
    void secondWrongSolution(){
        array = new int[]{2};
        assertEquals(0, Box.firstSolution(array));
    }
}