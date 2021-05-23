package com.coding.test.fang;

import com.coding.module1.fanginterview.WaterFixed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WaterFixedTest {

    WaterFixed waterFixed;

    @BeforeEach
    void beforeEach(){
        waterFixed = new WaterFixed();
    }

    @Test
    void firstTest(){
        int maxTest = waterFixed.calculate(new int[]{7,3,8,1,3,7} );
        System.out.println(maxTest);
    }

    @Test
    void parametrizeTest(){
        int maxTest = waterFixed.calculate(new int[]{1,8,6,2,5,4,5,3,7});
        assertEquals(49, maxTest);
    }

    @Test
    void leetCodeBruteForce(){
        int maxTest = waterFixed.calculateLeetCode(new int[]{2,1});
        assertEquals(1, maxTest);
    }


}