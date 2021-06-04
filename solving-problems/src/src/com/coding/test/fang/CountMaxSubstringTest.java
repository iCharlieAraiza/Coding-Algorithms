package com.coding.test.fang;

import com.coding.module1.fanginterview.CountMaxSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountMaxSubstringTest {
    private CountMaxSubstring test;

    @BeforeEach
    void beforeEach(){
        test = new CountMaxSubstring();
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "abcdcrteo, 6",
                    "lo, 2",
                    "abcabcbb, 3"
            }
    )
    void checkBaseCase(String string, Integer expected){
        assertEquals(expected, test.getMax(string));
    }

}
