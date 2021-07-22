package org.main.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.main.Array;

import java.util.ArrayList;
import java.util.HashMap;

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

    @Test
    public void firstRepeatedChar(){
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('w');
        characters.add('a');
        characters.add('d');
        characters.add('a');
        characters.add('e');
        characters.add('w');

        assertEquals('a', test.firstRepeatedChar(characters));
    }

    @Test
    public void firstRepeatedCharSingle(){
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('z');
        characters.add('w');
        characters.add('a');
        characters.add('d');
        characters.add('a');
        characters.add('e');
        characters.add('w');

        assertEquals('w', test.firstRepeatedCharSingle(characters));
    }


    @Test
    public void mergeTwoSortedList(){

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(4);

        b.add(1);
        b.add(3);
        b.add(4);

        test.mergeTwoSortedList(a, b).forEach(list-> System.out.println(list.toString()));

    }

}