package com.coding.test;

import com.coding.module1.datastructures.CountChar;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountCharTest {

    //This should return
    @Test
    void fourAExample(){
        CountChar counter = new CountChar();
        HashMap<Character, Integer> result = counter.count("abasasas");
        assertEquals("{a=4, b=1, s=3}", result.toString());
    }

    @Test
    void testHello(){
        CountChar counter = new CountChar();
        HashMap<Character, Integer> result = counter.count("hello");
        assertEquals("{e=1, h=1, l=2, o=1}", result.toString());
    }

}