package com.coding.test.fang;

import com.coding.module1.fanginterview.ShowIndices;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShowIndicesTest {

    // Input: {4,3,6,8,9,1}    12
    // Output: {0, 3}
    @Test
    void firstTestCase() {
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        ArrayList<Integer> result = test.calculateFirst(12);
        System.out.println(result.toString());
        assertEquals("[0, 3]",result.toString());
    }


    // Input: {4,3,6,8,9,1}    10
    // Output: {0. 2}
    @Test
    void secondTestCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        ArrayList<Integer> result = test.calculateFirst(10);
        assertEquals("[0, 2]",result.toString());
    }

    // Input: {4,3,6,8,9,1,22,7,2}    10
    // Output: {0. 2}
    @Test
    void thirdTestCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1,22,7,2});
        ArrayList<Integer> result = test.calculateFirst(24);
        assertEquals("[6, 8]",result.toString());
    }

    // Input: {4,3,6,8,9,1,22,7,2}    10
    // Output: {null}
    @Test
    void fourthTestCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1,22,7,2});
        ArrayList<Integer> result = test.calculateFirst(0);
        assertNull(result);
    }


    // Input: {4,3,6,8,9,1}    12
    // Output: {0, 3}
    @Test
    void firstHashCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        ArrayList<Integer> result = test.calculateSecond(12);
        assertEquals("[3, 0]",result.toString());
    }


    // Input: {4,3,6,8,9,1}    10
    // Output: {0. 2}
    @Test
    void secondHashCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        ArrayList<Integer> result = test.calculateSecond(10);
        assertEquals("[2, 0]",result.toString());
    }


    // Input: {4,3,6,8,9,1}    12
    // Output: {0, 3}
    @Test
    void firstArrayCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        int[] result = test.calculateLeetcode(12, new int[]{4,3,6,8,9,1});
        assertEquals("[0, 3]", Arrays.toString(result));
    }

    // Input: {4,3,6,8,9,1}    10
    // Output: {0. 2}
    @Test
    void secondArrayCase(){
        ShowIndices test = new ShowIndices(new int[]{4,3,6,8,9,1});
        int[] result = test.calculateLeetcode(10, new int[] {4,3,6,8,9,1});
        assertEquals("[0, 2]", Arrays.toString(result));
    }

}