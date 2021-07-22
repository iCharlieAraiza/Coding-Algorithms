package org.main.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.main.Strings;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {
    private Strings test;

    @BeforeEach
    public void beforeEach(){
        test = new Strings();
    }

    @ParameterizedTest
    @CsvSource({"aloh,hola", "tset,test", "avaj,java"})
    public void reverseString(String expected, String actual){
        assertEquals( expected, test.reverseString(actual) );
    }

}